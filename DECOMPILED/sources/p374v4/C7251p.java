package p374v4;

import com.google.firebase.database.C4906c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: v4.p */
/* JADX INFO: loaded from: classes.dex */
public class C7251p {

    /* JADX INFO: renamed from: b */
    private static final C7251p f28963b = new C7251p();

    /* JADX INFO: renamed from: a */
    private final Map f28964a = new HashMap();

    /* JADX INFO: renamed from: a */
    private C7247l m32085a(AbstractC7241f abstractC7241f, C7250o c7250o, C4906c c4906c) {
        C7247l c7247l;
        abstractC7241f.m31967k();
        String str = "https://" + c7250o.f28959a + "/" + c7250o.f28961c;
        synchronized (this.f28964a) {
            try {
                if (!this.f28964a.containsKey(abstractC7241f)) {
                    this.f28964a.put(abstractC7241f, new HashMap());
                }
                Map map = (Map) this.f28964a.get(abstractC7241f);
                if (map.containsKey(str)) {
                    throw new IllegalStateException("createLocalRepo() called for existing repo.");
                }
                c7247l = new C7247l(c7250o, abstractC7241f, c4906c);
                map.put(str, c7247l);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c7247l;
    }

    /* JADX INFO: renamed from: b */
    public static C7247l m32086b(AbstractC7241f abstractC7241f, C7250o c7250o, C4906c c4906c) {
        return f28963b.m32085a(abstractC7241f, c7250o, c4906c);
    }
}
