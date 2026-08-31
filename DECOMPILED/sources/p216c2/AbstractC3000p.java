package p216c2;

import android.util.Base64;
import p198a2.EnumC2190f;

/* JADX INFO: renamed from: c2.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3000p {

    /* JADX INFO: renamed from: c2.p$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract AbstractC3000p mo14932a();

        /* JADX INFO: renamed from: b */
        public abstract a mo14933b(String str);

        /* JADX INFO: renamed from: c */
        public abstract a mo14934c(byte[] bArr);

        /* JADX INFO: renamed from: d */
        public abstract a mo14935d(EnumC2190f enumC2190f);
    }

    /* JADX INFO: renamed from: a */
    public static a m14964a() {
        return new C2988d.b().mo14935d(EnumC2190f.DEFAULT);
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo14929b();

    /* JADX INFO: renamed from: c */
    public abstract byte[] mo14930c();

    /* JADX INFO: renamed from: d */
    public abstract EnumC2190f mo14931d();

    /* JADX INFO: renamed from: e */
    public boolean m14965e() {
        return mo14930c() != null;
    }

    /* JADX INFO: renamed from: f */
    public AbstractC3000p m14966f(EnumC2190f enumC2190f) {
        return m14964a().mo14933b(mo14929b()).mo14935d(enumC2190f).mo14934c(mo14930c()).mo14932a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", mo14929b(), mo14931d(), mo14930c() == null ? "" : Base64.encodeToString(mo14930c(), 2));
    }
}
