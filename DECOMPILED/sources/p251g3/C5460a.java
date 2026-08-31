package p251g3;

import android.app.Activity;
import com.google.android.gms.common.api.AbstractC3559g;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.api.internal.AbstractC3632w;
import com.google.android.gms.common.api.internal.C3588a;
import com.google.android.gms.common.api.internal.InterfaceC3622r;
import com.google.android.gms.internal.fido.zzo;
import com.google.android.gms.internal.fido.zzp;
import com.google.android.gms.internal.fido.zzs;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p259h3.C5633u;

/* JADX INFO: renamed from: g3.a */
/* JADX INFO: loaded from: classes.dex */
public class C5460a extends AbstractC3559g {

    /* JADX INFO: renamed from: a */
    private static final C3553a.g f20761a;

    /* JADX INFO: renamed from: b */
    private static final C3553a f20762b;

    static {
        C3553a.g gVar = new C3553a.g();
        f20761a = gVar;
        f20762b = new C3553a("Fido.FIDO2_API", new zzo(), gVar);
    }

    public C5460a(Activity activity) {
        super(activity, f20762b, C3553a.d.f14527n, new C3588a());
    }

    /* JADX INFO: renamed from: d */
    public Task m24669d(final C5633u c5633u) {
        return doRead(AbstractC3632w.m17942a().m17948b(new InterfaceC3622r() { // from class: g3.b
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final void accept(Object obj, Object obj2) {
                ((zzs) ((zzp) obj).getService()).zzc(new BinderC5462c(this.f20763a, (TaskCompletionSource) obj2), c5633u);
            }
        }).m17951e(5407).m17947a());
    }
}
