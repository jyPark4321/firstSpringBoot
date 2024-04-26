

// MySQL 모듈 로드
const mysql = require('mysql');

// MySQL 연결 정보 설정
const connection = mysql.createConnection({
    host: '192.168.10.17',
    user: 'root',
    password: 'admin1234',
    database: 'ksmart51db'
});

// MySQL 연결
connection.connect((err) => {
    if (err) {
        console.error('MySQL 연결 실패: ' + err.stack);
        return;
    }
    console.log('MySQL 연결 성공! 연결 ID: ' + connection.threadId);
});


 connection.end();

// 다른 JavaScript 파일에서 이 모듈을 사용할 수 있도록 export
module.exports = connection;