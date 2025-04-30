export interface BoardItem {
    id: number;
    title: string;
    writer: string;
    content: string;
}
// [{}, {}, ...] = 31가 들어갈 것이다.
export const boardList: BoardItem[] = Array.from({ length: 11 }, (_, i) => (
    {
        id: i + 1,
        title: `테스형이 작성한 글 ${i + 1}`,
        writer: `테스형 ${i + 1}`,
        content: `테스형님이 작성한 글 ${i + 1}입니다.`
    }
));