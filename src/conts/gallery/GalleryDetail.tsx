import React, { useEffect, useState } from 'react'
import styles from './gallery.module.css'
import { useNavigate, useParams } from 'react-router-dom'
import { GalleryItem, galleryList } from './galleryData';

const GalleryDetail: React.FC = () => {

    const { id } = useParams<{ id: string }>();

    const item = galleryList.find(item => item.id === Number(id));

    return (


        <div className={styles.container}>
            <h2 className={styles.title}>{item?.title}</h2>
            <div className={styles.detail}>
                <img src={item?.image} alt={item?.title} />
            </div>
        </div>
    )
}

export default GalleryDetail