import React, { useState } from 'react'
import styles from './gallery.module.css'
import { useNavigate } from 'react-router-dom';

const GalleryForm: React.FC = () => {

    const [title, setTitle] = useState('');
    const [image, setImage] = useState('');

    const navigate = useNavigate();

    const handleSubmit = (e: React.FormEvent<HTMLFormElement>) => {
        e.preventDefault();
        console.log('이미지 추가 : ', { title, image });

        const newGallery = {
            id: Date.now(),
            title,
            image
        }

        const galleryList = localStorage.getItem('galleryList');
        const list = galleryList ? JSON.parse(galleryList) : [];
        list.push(newGallery);
        localStorage.setItem("galleryList", JSON.stringify(list));
        navigate('/gallery');
    }

    return (
        <div className={styles.container}>
            <h2 className={styles.title}>이미지 등록</h2>
            <form className={styles.form} onSubmit={handleSubmit}>
                <input
                    className={styles.input}
                    type="text"
                    placeholder="제목 입력"
                    value={title}
                    onChange={e => setTitle(e.target.value)}
                    required
                />
                <input
                    className={styles.input}
                    type="text"
                    placeholder="이미지 URL 입력"
                    value={image}
                    onChange={e => setImage(e.target.value)}
                    required
                />
                <button type="submit" className={styles.button}>등록</button>
            </form>
        </div>
    )
}

export default GalleryForm