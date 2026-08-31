package com.google.android.gms.internal.p410authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.AbstractC3559g;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.api.internal.AbstractC3632w;
import com.google.android.gms.common.api.internal.InterfaceC3622r;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class zzr extends AbstractC3559g {
    private static final C3553a.g zza;
    private static final C3553a.a zzb;
    private static final C3553a zzc;

    static {
        C3553a.g gVar = new C3553a.g();
        zza = gVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new C3553a("SmsCodeAutofill.API", zznVar, gVar);
    }

    public zzr(Activity activity) {
        super(activity, zzc, (C3553a.d) C3553a.d.f14527n, AbstractC3559g.a.f14540c);
    }

    public final Task<Integer> checkPermissionState() {
        return doRead(AbstractC3632w.m17942a().m17950d(zzac.zza).m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth-api-phone.zzk
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzc(new zzp(this.zza, (TaskCompletionSource) obj2));
            }
        }).m17951e(1564).m17947a());
    }

    public final Task<Boolean> hasOngoingSmsRequest(final String str) {
        AbstractC3718s.m18083l(str);
        AbstractC3718s.m18073b(!str.isEmpty(), "The package name cannot be empty.");
        return doRead(AbstractC3632w.m17942a().m17950d(zzac.zza).m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth-api-phone.zzl
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzd(str, new zzq(this.zza, (TaskCompletionSource) obj2));
            }
        }).m17951e(1565).m17947a());
    }

    public final Task<Void> startSmsCodeRetriever() {
        return doWrite(AbstractC3632w.m17942a().m17950d(zzac.zza).m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth-api-phone.zzm
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zze(new zzo(this.zza, (TaskCompletionSource) obj2));
            }
        }).m17951e(1563).m17947a());
    }

    public zzr(Context context) {
        super(context, zzc, C3553a.d.f14527n, AbstractC3559g.a.f14540c);
    }
}
