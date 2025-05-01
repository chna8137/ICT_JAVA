// 만약 오라클이라면
// 테이블명 : board
// 입력 쿼리 : insert into board values(board_seq.nextVal, title, writer, content)
export interface BoardItem {
    id: number;
    title: string;
    writer: string;
    content: string;
}
// [{}, {}, ...] = 31가 들어갈 것이다.
// export const boardList: BoardItem[] = Array.from({ length: 11 }, (_, i) => (
//     {
//         id: i + 1,
//         title: `테스형이 작성한 글 ${i + 1}`,
//         writer: `테스형 ${i + 1}`,
//         content: `테스형님이 작성한 글 ${i + 1}입니다.`
//     }
// ));

// localStorage에서 저장된 게시판의 리스트를 자바스크립트 배열로 변환시킴.
// JSON.parse : JSON(문자열) => 자바스크립트 객체로 변환 *****
// JSON.stringify() : JSON.parse() 의 반대 즉, 자바스크립트 => JSON으로 변환 *****
// localStorage.getItem('boardList')가 null일 경우 빈 배열 문자열 '[]'을 대신 파싱
export const boardList: BoardItem[] = JSON.parse(localStorage.getItem('boardList') || '[]');