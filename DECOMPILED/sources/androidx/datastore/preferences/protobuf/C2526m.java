package androidx.datastore.preferences.protobuf;

import androidx.appcompat.app.AbstractC2263x;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m */
/* JADX INFO: loaded from: classes.dex */
public class C2526m {

    /* JADX INFO: renamed from: b */
    private static volatile C2526m f9631b;

    /* JADX INFO: renamed from: c */
    static final C2526m f9632c = new C2526m(true);

    /* JADX INFO: renamed from: a */
    private final Map f9633a = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private final Object f9634a;

        /* JADX INFO: renamed from: b */
        private final int f9635b;

        a(Object obj, int i7) {
            this.f9634a = obj;
            this.f9635b = i7;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9634a == aVar.f9634a && this.f9635b == aVar.f9635b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f9634a) * 65535) + this.f9635b;
        }
    }

    C2526m(boolean z7) {
    }

    /* JADX INFO: renamed from: b */
    public static C2526m m11556b() {
        C2526m c2526mM11553a;
        if (C2496U.f9472d) {
            return f9632c;
        }
        C2526m c2526m = f9631b;
        if (c2526m != null) {
            return c2526m;
        }
        synchronized (C2526m.class) {
            try {
                c2526mM11553a = f9631b;
                if (c2526mM11553a == null) {
                    c2526mM11553a = AbstractC2524l.m11553a();
                    f9631b = c2526mM11553a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2526mM11553a;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC2533t.c m11557a(InterfaceC2486J interfaceC2486J, int i7) {
        AbstractC2263x.m9328a(this.f9633a.get(new a(interfaceC2486J, i7)));
        return null;
    }
}
