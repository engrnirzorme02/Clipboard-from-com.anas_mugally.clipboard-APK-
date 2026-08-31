package p112O0;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: O0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1090c {

    /* JADX INFO: renamed from: a */
    private final Set f3940a = new HashSet();

    /* JADX INFO: renamed from: O0.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final Uri f3941a;

        /* JADX INFO: renamed from: b */
        private final boolean f3942b;

        a(Uri uri, boolean z7) {
            this.f3941a = uri;
            this.f3942b = z7;
        }

        /* JADX INFO: renamed from: a */
        public Uri m4833a() {
            return this.f3941a;
        }

        /* JADX INFO: renamed from: b */
        public boolean m4834b() {
            return this.f3942b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f3942b == aVar.f3942b && this.f3941a.equals(aVar.f3941a)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f3941a.hashCode() * 31) + (this.f3942b ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4830a(Uri uri, boolean z7) {
        this.f3940a.add(new a(uri, z7));
    }

    /* JADX INFO: renamed from: b */
    public Set m4831b() {
        return this.f3940a;
    }

    /* JADX INFO: renamed from: c */
    public int m4832c() {
        return this.f3940a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1090c.class != obj.getClass()) {
            return false;
        }
        return this.f3940a.equals(((C1090c) obj).f3940a);
    }

    public int hashCode() {
        return this.f3940a.hashCode();
    }
}
