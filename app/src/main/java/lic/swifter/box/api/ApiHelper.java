package lic.swifter.box.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiHelper {

    public static final int API_JUHEAPI_COM = 1;
    public static final int V_JUHE_CN = 2;
    public static final int JAPI_JUHE_CN = 3;
    public static final int OP_JUHE_CN = 4;
    public static final int APIS_JUHE_CN = 5;

    public static JuheApi getJuhe() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://apis.juhe.cn/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(JuheApi.class);
    }

    public static JuheApi getJuhe(int type) {
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.addConverterFactory(GsonConverterFactory.create());
        switch (type) {
            case API_JUHEAPI_COM:
                builder.baseUrl("http://api.juheapi.com/");
                break;
            case V_JUHE_CN:
                builder.baseUrl("http://v.juhe.cn/");
                break;
            case JAPI_JUHE_CN:
                builder.baseUrl("http://japi.juhe.cn/");
                break;
            case OP_JUHE_CN:
                builder.baseUrl("http://op.juhe.cn/");
                break;
            case APIS_JUHE_CN:
                builder.baseUrl("http://apis.juhe.cn/");
                break;
        }
        return builder.build().create(JuheApi.class);
    }
}
