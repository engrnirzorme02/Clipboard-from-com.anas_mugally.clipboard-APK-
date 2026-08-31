package p314o2;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.C3364l1;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.List;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: o2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6549a {

    /* JADX INFO: renamed from: a */
    protected final C3364l1 f24721a;

    protected AbstractC6549a() {
        C3364l1 c3364l1 = new C3364l1();
        this.f24721a = c3364l1;
        c3364l1.m17251i("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    /* JADX INFO: renamed from: a */
    public AbstractC6549a m27797a(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
            StringBuilder sb = new StringBuilder(str2.length() + 108);
            sb.append("Value ");
            sb.append(str2);
            sb.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
            AbstractC7599p.m33331f(sb.toString());
        }
        this.f24721a.m17258p(str, str2);
        return mo27800d();
    }

    /* JADX INFO: renamed from: b */
    public AbstractC6549a m27798b(String str) {
        this.f24721a.m17249g(str);
        return mo27800d();
    }

    /* JADX INFO: renamed from: c */
    public AbstractC6549a m27799c(Class cls, Bundle bundle) {
        C3364l1 c3364l1 = this.f24721a;
        c3364l1.m17250h(cls, bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            c3364l1.m17252j("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return mo27800d();
    }

    /* JADX INFO: renamed from: d */
    protected abstract AbstractC6549a mo27800d();

    /* JADX INFO: renamed from: e */
    public AbstractC6549a m27801e(String str) {
        AbstractC3718s.m18084m(str, "Content URL must be non-null.");
        AbstractC3718s.m18078g(str, "Content URL must be non-empty.");
        int length = str.length();
        AbstractC3718s.m18074c(length <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
        this.f24721a.m17253k(str);
        return mo27800d();
    }

    /* JADX INFO: renamed from: f */
    public AbstractC6549a m27802f(List list) {
        if (list == null) {
            AbstractC7599p.m33331f("neighboring content URLs list should not be null");
            return mo27800d();
        }
        this.f24721a.m17254l(list);
        return mo27800d();
    }

    /* JADX INFO: renamed from: g */
    public AbstractC6549a m27803g(String str) {
        this.f24721a.m17256n(str);
        return mo27800d();
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC6549a m27804h(String str) {
        this.f24721a.m17251i(str);
        return mo27800d();
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC6549a m27805i(boolean z7) {
        this.f24721a.m17257o(z7);
        return mo27800d();
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC6549a m27806j(boolean z7) {
        this.f24721a.m17260r(z7);
        return mo27800d();
    }
}
