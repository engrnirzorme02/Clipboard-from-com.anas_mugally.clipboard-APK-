package p327p5;

import android.net.Uri;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.C6099B;
import org.json.JSONObject;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p301m5.C6374b;
import p318o6.AbstractC6668i;
import p318o6.InterfaceC6624N;

/* JADX INFO: renamed from: p5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6762e implements InterfaceC6758a {

    /* JADX INFO: renamed from: c */
    public static final a f27161c = new a(null);

    /* JADX INFO: renamed from: a */
    private final C6374b f27162a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1879i f27163b;

    /* JADX INFO: renamed from: p5.e$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: p5.e$b */
    static final class b extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f27164a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Map f27166c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC5371p f27167d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InterfaceC5371p f27168e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Map map, InterfaceC5371p interfaceC5371p, InterfaceC5371p interfaceC5371p2, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f27166c = map;
            this.f27167d = interfaceC5371p;
            this.f27168e = interfaceC5371p2;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C6762e.this.new b(this.f27166c, this.f27167d, this.f27168e, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00cb, code lost:
        
            if (r8.invoke(r1, r7) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
        
            if (r1.invoke(r3, r7) == r0) goto L36;
         */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f27164a;
            try {
                if (i7 == 0) {
                    AbstractC1437o.m6082b(obj);
                    URLConnection uRLConnectionOpenConnection = C6762e.this.m29561c().openConnection();
                    AbstractC6118n.m27185c(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setRequestProperty("Accept", "application/json");
                    for (Map.Entry entry : this.f27166c.entrySet()) {
                        httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb = new StringBuilder();
                        C6099B c6099b = new C6099B();
                        while (true) {
                            String line = bufferedReader.readLine();
                            c6099b.f23859a = line;
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        JSONObject jSONObject = new JSONObject(sb.toString());
                        InterfaceC5371p interfaceC5371p = this.f27167d;
                        this.f27164a = 1;
                        if (interfaceC5371p.invoke(jSONObject, this) == objE) {
                            return objE;
                        }
                    } else {
                        InterfaceC5371p interfaceC5371p2 = this.f27168e;
                        String str = "Bad response code: " + responseCode;
                        this.f27164a = 2;
                    }
                } else {
                    if (i7 != 1 && i7 != 2 && i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                }
            } catch (Exception e7) {
                InterfaceC5371p interfaceC5371p3 = this.f27168e;
                String message = e7.getMessage();
                if (message == null) {
                    message = e7.toString();
                }
                this.f27164a = 3;
            }
            return C1444v.f4971a;
        }
    }

    public C6762e(C6374b appInfo, InterfaceC1879i blockingDispatcher) {
        AbstractC6118n.m27187e(appInfo, "appInfo");
        AbstractC6118n.m27187e(blockingDispatcher, "blockingDispatcher");
        this.f27162a = appInfo;
        this.f27163b = blockingDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final URL m29561c() {
        return new URL(new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.f27162a.m27478b()).appendPath("settings").appendQueryParameter("build_version", this.f27162a.m27477a().m27471a()).appendQueryParameter("display_version", this.f27162a.m27477a().m27476f()).build().toString());
    }

    @Override // p327p5.InterfaceC6758a
    /* JADX INFO: renamed from: a */
    public Object mo29544a(Map map, InterfaceC5371p interfaceC5371p, InterfaceC5371p interfaceC5371p2, InterfaceC1875e interfaceC1875e) {
        Object objM28186g = AbstractC6668i.m28186g(this.f27163b, new b(map, interfaceC5371p, interfaceC5371p2, null), interfaceC1875e);
        return objM28186g == AbstractC2005b.m8369e() ? objM28186g : C1444v.f4971a;
    }
}
