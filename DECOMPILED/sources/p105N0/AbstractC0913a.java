package p105N0;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p088K6.AbstractC0764a;

/* JADX INFO: renamed from: N0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0913a implements InterfaceC0917e {

    /* JADX INFO: renamed from: c */
    private static final Set f3551c = new HashSet();

    /* JADX INFO: renamed from: a */
    private final String f3552a;

    /* JADX INFO: renamed from: b */
    private final String f3553b;

    /* JADX INFO: renamed from: N0.a$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        static final Set f3554a = new HashSet(Arrays.asList(AbstractC0929q.m4163c().mo4151a()));
    }

    /* JADX INFO: renamed from: N0.a$b */
    public static class b extends AbstractC0913a {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // p105N0.AbstractC0913a
        /* JADX INFO: renamed from: c */
        public final boolean mo4146c() {
            return true;
        }
    }

    /* JADX INFO: renamed from: N0.a$c */
    public static class c extends AbstractC0913a {
        c(String str, String str2) {
            super(str, str2);
        }

        @Override // p105N0.AbstractC0913a
        /* JADX INFO: renamed from: c */
        public final boolean mo4146c() {
            return true;
        }
    }

    /* JADX INFO: renamed from: N0.a$d */
    public static class d extends AbstractC0913a {
        d(String str, String str2) {
            super(str, str2);
        }

        @Override // p105N0.AbstractC0913a
        /* JADX INFO: renamed from: c */
        public final boolean mo4146c() {
            return false;
        }
    }

    /* JADX INFO: renamed from: N0.a$e */
    public static class e extends AbstractC0913a {
        e(String str, String str2) {
            super(str, str2);
        }

        @Override // p105N0.AbstractC0913a
        /* JADX INFO: renamed from: c */
        public final boolean mo4146c() {
            return true;
        }
    }

    /* JADX INFO: renamed from: N0.a$f */
    public static class f extends AbstractC0913a {
        f(String str, String str2) {
            super(str, str2);
        }

        @Override // p105N0.AbstractC0913a
        /* JADX INFO: renamed from: c */
        public final boolean mo4146c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* JADX INFO: renamed from: N0.a$g */
    public static class g extends AbstractC0913a {
        g(String str, String str2) {
            super(str, str2);
        }

        @Override // p105N0.AbstractC0913a
        /* JADX INFO: renamed from: c */
        public final boolean mo4146c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* JADX INFO: renamed from: N0.a$h */
    public static class h extends AbstractC0913a {
        h(String str, String str2) {
            super(str, str2);
        }

        @Override // p105N0.AbstractC0913a
        /* JADX INFO: renamed from: c */
        public final boolean mo4146c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* JADX INFO: renamed from: N0.a$i */
    public static class i extends AbstractC0913a {
        i(String str, String str2) {
            super(str, str2);
        }

        @Override // p105N0.AbstractC0913a
        /* JADX INFO: renamed from: c */
        public final boolean mo4146c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    AbstractC0913a(String str, String str2) {
        this.f3552a = str;
        this.f3553b = str2;
        f3551c.add(this);
    }

    /* JADX INFO: renamed from: e */
    public static Set m4143e() {
        return Collections.unmodifiableSet(f3551c);
    }

    @Override // p105N0.InterfaceC0917e
    /* JADX INFO: renamed from: a */
    public boolean mo4144a() {
        return mo4146c() || mo4147d();
    }

    @Override // p105N0.InterfaceC0917e
    /* JADX INFO: renamed from: b */
    public String mo4145b() {
        return this.f3552a;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo4146c();

    /* JADX INFO: renamed from: d */
    public boolean mo4147d() {
        return AbstractC0764a.m3595b(a.f3554a, this.f3553b);
    }
}
