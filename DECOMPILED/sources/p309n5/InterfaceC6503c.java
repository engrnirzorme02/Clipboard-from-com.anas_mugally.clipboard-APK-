package p309n5;

import kotlin.jvm.internal.AbstractC6118n;
import p187Y5.AbstractC2060b;
import p187Y5.InterfaceC2059a;

/* JADX INFO: renamed from: n5.c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6503c {

    /* JADX INFO: renamed from: n5.c$a */
    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI;


        /* JADX INFO: renamed from: e */
        private static final /* synthetic */ InterfaceC2059a f24603e = AbstractC2060b.m8524a(m27685c());
    }

    /* JADX INFO: renamed from: n5.c$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final String f24604a;

        public b(String sessionId) {
            AbstractC6118n.m27187e(sessionId, "sessionId");
            this.f24604a = sessionId;
        }

        /* JADX INFO: renamed from: a */
        public final String m27686a() {
            return this.f24604a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6118n.m27183a(this.f24604a, ((b) obj).f24604a);
        }

        public int hashCode() {
            return this.f24604a.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.f24604a + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    void mo24818a(b bVar);

    /* JADX INFO: renamed from: b */
    boolean mo24819b();

    /* JADX INFO: renamed from: c */
    a mo24820c();
}
