package p243f3;

import android.app.Activity;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.internal.fido.zzaa;
import com.google.android.gms.internal.fido.zzab;
import p251g3.C5460a;

/* JADX INFO: renamed from: f3.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5435a {

    /* JADX INFO: renamed from: a */
    public static final C3553a.g f20701a;

    /* JADX INFO: renamed from: b */
    public static final C3553a f20702b;

    /* JADX INFO: renamed from: c */
    public static final zzaa f20703c;

    static {
        C3553a.g gVar = new C3553a.g();
        f20701a = gVar;
        f20702b = new C3553a("Fido.U2F_ZERO_PARTY_API", new zzab(), gVar);
        f20703c = new zzaa();
    }

    /* JADX INFO: renamed from: a */
    public static C5460a m24642a(Activity activity) {
        return new C5460a(activity);
    }
}
