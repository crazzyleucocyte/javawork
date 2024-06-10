package org.dendrocopos.chzzkbot.core.api;

/*package org.dendrocopos.chzzkbot.core.api;

import org.dendrocopos.chzzkbot.core.utils.ErrorCode;

public class ApiResponse<T> {//생성자 T는 제너릭 클래스 사용할 때 필요한 타입 지정 가능
    private ApiHeader header;
    private ApiBody body;
    private static int SUCCESS = 200;// 성공 상태 코드 200

    public ApiResponse(ApiHeader header) {//생성자 헤더만 들어왔을 때
        this.header = header;
    }

    public ApiResponse(ApiHeader header, ApiBody body) {//생성자 헤더와 바디가 들어왔을 때 
        this.header = header;
        this.body = body;
    }

    public static <T> ApiResponse<T> OK(T data) {
        return new ApiResponse<>(
                ApiHeader.builder().resultCode(SUCCESS).codeName("SUCCESS").build()//API헤더의 result와 name을 가지고 와서 생성한다.
                ,ApiBody.builder().data(data).msg(null).build()//API바디의 data와 msg를 가지고 와서 생성한다.
        );
    }

    public static <T> ApiResponse<T> FAIL(ErrorCode errorCode) {
        return new ApiResponse<>(
                ApiHeader.builder().resultCode(errorCode.getCode()).codeName(errorCode.name()).build()
                ,ApiBody.builder().data(null).msg(errorCode.getMessage()).build()
        );
    }
}
*/
public class ApiResponse {

}
