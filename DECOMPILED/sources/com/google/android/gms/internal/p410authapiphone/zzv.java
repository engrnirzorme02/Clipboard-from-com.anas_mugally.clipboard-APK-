package com.google.android.gms.internal.p410authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.AbstractC3559g;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.api.internal.AbstractC3632w;
import com.google.android.gms.common.api.internal.InterfaceC3622r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class zzv extends AbstractC3559g {
    private static final C3553a.g zza;
    private static final C3553a.a zzb;
    private static final C3553a zzc;

    static {
        C3553a.g gVar = new C3553a.g();
        zza = gVar;
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzc = new C3553a("SmsCodeBrowser.API", zztVar, gVar);
    }

    public zzv(Activity activity) {
        super(activity, zzc, (C3553a.d) C3553a.d.f14527n, AbstractC3559g.a.f14540c);
    }

    public final Task<Void> startSmsCodeRetriever() {
        return doWrite(AbstractC3632w.m17942a().m17950d(zzac.zzb).m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth-api-phone.zzs
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzf(new zzu(this.zza, (TaskCompletionSource) obj2));
            }
        }).m17951e(1566).m17947a());
    }

    public zzv(Context context) {
        super(context, zzc, C3553a.d.f14527n, AbstractC3559g.a.f14540c);
    }
}
