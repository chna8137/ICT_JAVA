export interface GalleryItem {
    id: number,
    card: string,
    title: string,
    image: string
}

export const galleryList: GalleryItem[] = JSON.parse(localStorage.getItem('galleryList') || '[]');