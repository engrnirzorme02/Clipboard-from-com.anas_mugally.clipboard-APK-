package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.common.api.AbstractC3559g;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.api.C3554b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3632w;
import com.google.android.gms.common.api.internal.InterfaceC3622r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import p084K2.AbstractC0743h;
import p084K2.C0738c;
import p084K2.C0739d;
import p084K2.InterfaceC0737b;
import p170W2.C1841f;

/* JADX INFO: loaded from: classes2.dex */
public final class zzp extends AbstractC3559g implements InterfaceC0737b {
    private static final C3553a.g zza;
    private static final C3553a.a zzb;
    private static final C3553a zzc;
    private final Context zzd;
    private final C1841f zze;

    static {
        C3553a.g gVar = new C3553a.g();
        zza = gVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new C3553a("AppSet.API", zznVar, gVar);
    }

    zzp(Context context, C1841f c1841f) {
        super(context, zzc, C3553a.d.f14527n, AbstractC3559g.a.f14540c);
        this.zzd = context;
        this.zze = c1841f;
    }

    @Override // p084K2.InterfaceC0737b
    public final Task<C0738c> getAppSetIdInfo() {
        return this.zze.mo7609h(this.zzd, 212800000) == 0 ? doRead(AbstractC3632w.m17942a().m17950d(AbstractC0743h.f2922a).m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.appset.zzm
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzd) obj).getService()).zzc(new C0739d(null, null), new zzo(this.zza, (TaskCompletionSource) obj2));
            }
        }).m17949c(false).m17951e(27601).m17947a()) : Tasks.forException(new C3554b(new Status(17)));
    }
}
