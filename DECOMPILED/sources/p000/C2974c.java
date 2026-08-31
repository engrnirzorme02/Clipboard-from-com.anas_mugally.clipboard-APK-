package p000;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.util.Log;
import com.anas_mugally.clipboard.MyApplication;
import com.anas_mugally.clipboard.p221ui.p222ai.models.AiPrompt;
import com.anas_mugally.clipboard.p221ui.p222ai.models.ApiResponse;
import com.anas_mugally.clipboard.p221ui.p222ai.models.ProcessingRequest;
import com.anas_mugally.clipboard.p221ui.p222ai.models.ProcessingResultData;
import com.google.gson.C5026e;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import p145S5.AbstractC1430h;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5371p;
import p318o6.AbstractC6618K;
import p318o6.AbstractC6626O;
import p318o6.AbstractC6634S0;
import p318o6.AbstractC6668i;
import p318o6.C6656c0;
import p318o6.InterfaceC6624N;

/* JADX INFO: renamed from: c */
/* JADX INFO: loaded from: classes2.dex */
public final class C2974c {

    /* JADX INFO: renamed from: e */
    public static final a f12273e = new a(null);

    /* JADX INFO: renamed from: a */
    private final MyApplication f12274a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1429g f12275b;

    /* JADX INFO: renamed from: c */
    private final C5026e f12276c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC6624N f12277d;

    /* JADX INFO: renamed from: c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: c$b */
    private static final class b implements Interceptor {
        @Override // okhttp3.Interceptor
        /* JADX INFO: renamed from: a */
        public Response mo14834a(Interceptor.Chain chain) {
            AbstractC6118n.m27187e(chain, "chain");
            Request requestMo28559b = chain.mo28559b();
            Log.d("ApiClient", "Request: " + requestMo28559b.m28654h() + ' ' + requestMo28559b.m28656j());
            Response responseMo28558a = chain.mo28558a(requestMo28559b);
            Log.d("ApiClient", "Response: " + responseMo28558a.m28672J() + " for " + requestMo28559b.m28656j());
            return responseMo28558a;
        }
    }

    /* JADX INFO: renamed from: c$c */
    static final class c extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12278a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Request f12280c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Request request, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f12280c = request;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C2974c.this.new c(this.f12280c, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((c) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f12278a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            return C2974c.this.m14830i().m28601v(this.f12280c).mo28363n();
        }
    }

    /* JADX INFO: renamed from: c$d */
    static final class d extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        /* synthetic */ Object f12281a;

        /* JADX INFO: renamed from: c */
        int f12283c;

        d(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f12281a = obj;
            this.f12283c |= Integer.MIN_VALUE;
            return C2974c.this.m14832k(null, this);
        }
    }

    /* JADX INFO: renamed from: c$e */
    static final class e extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        /* synthetic */ Object f12284a;

        /* JADX INFO: renamed from: c */
        int f12286c;

        e(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f12284a = obj;
            this.f12286c |= Integer.MIN_VALUE;
            return C2974c.this.m14833l(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: c$f */
    static final class f extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12287a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f12289c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f12290d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f12291e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ AiPrompt f12292f;

        /* JADX INFO: renamed from: r */
        final /* synthetic */ String f12293r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, String str2, String str3, AiPrompt aiPrompt, String str4, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f12289c = str;
            this.f12290d = str2;
            this.f12291e = str3;
            this.f12292f = aiPrompt;
            this.f12293r = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C2974c.this.new f(this.f12289c, this.f12290d, this.f12291e, this.f12292f, this.f12293r, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((f) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f12287a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            try {
                long jM14829h = C2974c.this.m14829h();
                String strM22630s = C2974c.this.f12276c.m22630s(new ProcessingRequest(this.f12289c, this.f12290d, this.f12291e, this.f12292f.getId(), this.f12292f.isCustom() ? this.f12292f.getPrompt() : null, this.f12293r, jM14829h));
                RequestBody.Companion companion = RequestBody.f25422a;
                AbstractC6118n.m27184b(strM22630s);
                Response responseMo28363n = C2974c.this.m14830i().m28601v(new Request.Builder().m28664h("https://api.clipzboard.com/index.php").m28662f(companion.m28669a(strM22630s, MediaType.f25301e.m28565a("application/json"))).m28657a("Content-Type", "application/json").m28657a("App-Version-Code", String.valueOf(jM14829h)).m28658b()).mo28363n();
                ResponseBody responseBodyM28681d = responseMo28363n.m28681d();
                String strM28710J = responseBodyM28681d != null ? responseBodyM28681d.m28710J() : null;
                if (!responseMo28363n.m28687p0() || strM28710J == null) {
                    return new ApiResponse(false, null, "SERVER_ERROR", "HTTP Error: " + responseMo28363n.m28672J(), null, null, 50, null);
                }
                ApiResponse apiResponse = (ApiResponse) C2974c.this.f12276c.m22621i(strM28710J, ApiResponse.class);
                StringBuilder sb = new StringBuilder();
                sb.append("Remaining requests: ");
                ProcessingResultData result = apiResponse.getResult();
                sb.append(result != null ? result.getRemainingRequests() : null);
                Log.d("AI_DEBUG", sb.toString());
                return apiResponse;
            } catch (IOException e7) {
                Log.e("AI_DEBUG", "Network error: " + e7.getMessage());
                return new ApiResponse(false, null, "NETWORK_ERROR", e7.getMessage(), null, null, 50, null);
            } catch (Exception e8) {
                Log.e("AI_DEBUG", "Unknown error: " + e8.getMessage());
                return new ApiResponse(false, null, "UNKNOWN_ERROR", e8.getMessage(), null, null, 50, null);
            }
        }
    }

    public C2974c() {
        MyApplication myApplicationM15105a = MyApplication.f12496a.m15105a();
        AbstractC6118n.m27184b(myApplicationM15105a);
        this.f12274a = myApplicationM15105a;
        this.f12275b = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: b
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C2974c.m14826e();
            }
        });
        this.f12276c = new C5026e();
        this.f12277d = AbstractC6626O.m28098a(C6656c0.m28163b().plus(AbstractC6634S0.m28112b(null, 1, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final OkHttpClient m14826e() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return builder.m28618c(30L, timeUnit).m28615J(30L, timeUnit).m28613H(60L, timeUnit).m28616a(new b()).m28614I(true).m28617b();
    }

    /* JADX INFO: renamed from: f */
    private final Object m14827f(JSONObject jSONObject, InterfaceC1875e interfaceC1875e) {
        MediaType mediaTypeM28565a = MediaType.f25301e.m28565a("application/json; charset=utf-8");
        RequestBody.Companion companion = RequestBody.f25422a;
        String string = jSONObject.toString();
        AbstractC6118n.m27186d(string, "toString(...)");
        return AbstractC6668i.m28186g(C6656c0.m28163b(), new c(new Request.Builder().m28664h("https://api.clipzboard.com/event_log_api.php").m28662f(companion.m28669a(string, mediaTypeM28565a)).m28657a("Content-Type", "application/json").m28657a("User-Agent", "AI-Clipboard-Android/" + m14828g()).m28657a("Accept", "application/json").m28658b(), null), interfaceC1875e);
    }

    /* JADX INFO: renamed from: g */
    private final String m14828g() {
        try {
            String str = this.f12274a.getPackageManager().getPackageInfo(this.f12274a.getPackageName(), 0).versionName;
            return str == null ? "1.0.0" : str;
        } catch (Exception unused) {
            return "1.0.0";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final long m14829h() {
        Object objValueOf;
        try {
            PackageInfo packageInfo = this.f12274a.getPackageManager().getPackageInfo(this.f12274a.getPackageName(), 0);
            objValueOf = Build.VERSION.SDK_INT >= 28 ? Long.valueOf(packageInfo.getLongVersionCode()) : Integer.valueOf(packageInfo.versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            objValueOf = 1;
        }
        return ((Long) objValueOf).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final OkHttpClient m14830i() {
        return (OkHttpClient) this.f12275b.getValue();
    }

    /* JADX INFO: renamed from: j */
    private final boolean m14831j() {
        NetworkCapabilities networkCapabilities;
        try {
            Object systemService = this.f12274a.getSystemService("connectivity");
            AbstractC6118n.m27185c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            return networkCapabilities.hasCapability(12);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m14832k(JSONObject jSONObject, InterfaceC1875e interfaceC1875e) {
        d dVar;
        String strM28710J;
        if (interfaceC1875e instanceof d) {
            dVar = (d) interfaceC1875e;
            int i7 = dVar.f12283c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                dVar.f12283c = i7 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC1875e);
            }
        } else {
            dVar = new d(interfaceC1875e);
        }
        Object objM14827f = dVar.f12281a;
        Object objE = AbstractC2005b.m8369e();
        int i8 = dVar.f12283c;
        try {
            if (i8 == 0) {
                AbstractC1437o.m6082b(objM14827f);
                if (!m14831j()) {
                    return new AbstractC5157d.a("No network connection", -1, null, 4, null);
                }
                dVar.f12283c = 1;
                objM14827f = m14827f(jSONObject, dVar);
                if (objM14827f == objE) {
                    return objE;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(objM14827f);
            }
            Response response = (Response) objM14827f;
            if (response.m28687p0()) {
                ResponseBody responseBodyM28681d = response.m28681d();
                String strM28710J2 = responseBodyM28681d != null ? responseBodyM28681d.m28710J() : null;
                if (strM28710J2 == null) {
                    strM28710J2 = "";
                }
                return new AbstractC5157d.b(strM28710J2, response.m28672J());
            }
            ResponseBody responseBodyM28681d2 = response.m28681d();
            if (responseBodyM28681d2 == null || (strM28710J = responseBodyM28681d2.m28710J()) == null) {
                strM28710J = "Unknown server error";
            }
            return new AbstractC5157d.a("Server error: " + response.m28672J(), response.m28672J(), strM28710J);
        } catch (Exception e7) {
            Log.w("ApiClient", "Failed to log event: " + e7.getMessage());
            return new AbstractC5157d.a("Failed to log event: " + e7.getMessage(), -1, e7.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: l */
    public final Object m14833l(String str, String str2, String str3, AiPrompt aiPrompt, String str4, InterfaceC1875e interfaceC1875e) {
        e eVar;
        if (interfaceC1875e instanceof e) {
            eVar = (e) interfaceC1875e;
            int i7 = eVar.f12286c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                eVar.f12286c = i7 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC1875e);
            }
        } else {
            eVar = new e(interfaceC1875e);
        }
        Object objM28186g = eVar.f12284a;
        Object objE = AbstractC2005b.m8369e();
        int i8 = eVar.f12286c;
        if (i8 == 0) {
            AbstractC1437o.m6082b(objM28186g);
            AbstractC6618K abstractC6618KM28163b = C6656c0.m28163b();
            f fVar = new f(str, str2, str3, aiPrompt, str4, null);
            eVar.f12286c = 1;
            objM28186g = AbstractC6668i.m28186g(abstractC6618KM28163b, fVar, eVar);
            if (objM28186g == objE) {
                return objE;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(objM28186g);
        }
        AbstractC6118n.m27186d(objM28186g, "withContext(...)");
        return objM28186g;
    }
}
