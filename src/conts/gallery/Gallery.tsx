import React, { useEffect, useState } from 'react'
import styles from './gallery.module.css'
import { Link } from 'react-router-dom'
import { GalleryItem } from './galleryData';

const Gallery: React.FC = () => {

    const [galleryList, setGalleryList] = useState<GalleryItem[]>([]);
    useEffect(() => {
        const data = localStorage.getItem('galleryList');
        if (data) {
            setGalleryList(JSON.parse(data));
        }
    }, [])

    return (
        <div className={styles.container}>
            <h2 className={styles.title}>갤러리</h2>
            <div style={{ textAlign: 'right', marginBottom: '15px' }}>
                <Link to="/gallery/write" className={styles.button}>이미지 추가</Link>
            </div>
            <div className={styles.grid}>
                {
                    galleryList.map((item) => (
                        <Link to={`/gallery/${item.id}`} key={item.id} style={{ textDecoration: 'none' }}>
                            <div className={styles.card}>
                                <img src={item.image} alt={item.title} />
                                <div className={styles.cardTitle}>{item.title}</div>
                            </div>
                        </Link>
                    ))
                }
            </div>
        </div>
    )
}

export default Gallery