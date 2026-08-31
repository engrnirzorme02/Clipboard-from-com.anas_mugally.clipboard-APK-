package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.AbstractC3559g;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3632w;
import com.google.android.gms.common.api.internal.AbstractC3634x;
import com.google.android.gms.common.api.internal.InterfaceC3622r;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p092L2.AbstractC0840g;
import p092L2.AbstractC0841h;
import p092L2.C0835b;
import p191Z2.C2086a;

/* JADX INFO: loaded from: classes2.dex */
final class zzab extends AbstractC3559g implements zzg {
    private static final C3553a.g zza;
    private static final C3553a.a zzb;
    private static final C3553a zzc;
    private static final C2086a zzd;
    private final Context zze;

    static {
        C3553a.g gVar = new C3553a.g();
        zza = gVar;
        zzv zzvVar = new zzv();
        zzb = zzvVar;
        zzc = new C3553a("GoogleAuthService.API", zzvVar, gVar);
        zzd = AbstractC0840g.m3880a("GoogleAuthServiceClient");
    }

    zzab(Context context) {
        super(context, zzc, C3553a.d.f14527n, AbstractC3559g.a.f14540c);
        this.zze = context;
    }

    static /* bridge */ /* synthetic */ void zzf(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (AbstractC3634x.m17955c(status, obj, taskCompletionSource)) {
            return;
        }
        zzd.m8620h("The task is already complete.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zza(final zzbw zzbwVar) {
        return doWrite(AbstractC3632w.m17942a().m17950d(AbstractC0841h.f3317l).m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth.zzt
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzd(new zzx(zzabVar, (TaskCompletionSource) obj2), zzbwVar);
            }
        }).m17951e(1513).m17947a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzb(final C0835b c0835b) {
        AbstractC3718s.m18084m(c0835b, "request cannot be null.");
        return doWrite(AbstractC3632w.m17942a().m17950d(AbstractC0841h.f3316k).m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth.zzu
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = this.zza;
                C0835b c0835b2 = c0835b;
                ((zzp) ((zzi) obj).getService()).zze(new zzz(zzabVar, (TaskCompletionSource) obj2), c0835b2);
            }
        }).m17951e(1515).m17947a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzc(final Account account, final String str, final Bundle bundle) {
        AbstractC3718s.m18084m(account, "Account name cannot be null!");
        AbstractC3718s.m18078g(str, "Scope cannot be null!");
        return doWrite(AbstractC3632w.m17942a().m17950d(AbstractC0841h.f3317l).m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth.zzs
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzf(new zzw(zzabVar, (TaskCompletionSource) obj2), account, str, bundle);
            }
        }).m17951e(1512).m17947a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzd(final Account account) {
        AbstractC3718s.m18084m(account, "account cannot be null.");
        return doWrite(AbstractC3632w.m17942a().m17950d(AbstractC0841h.f3316k).m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth.zzr
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzg(new zzaa(zzabVar, (TaskCompletionSource) obj2), account);
            }
        }).m17951e(1517).m17947a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zze(final String str) {
        AbstractC3718s.m18084m(str, "Client package name cannot be null!");
        return doWrite(AbstractC3632w.m17942a().m17950d(AbstractC0841h.f3316k).m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth.zzq
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = this.zza;
                ((zzp) ((zzi) obj).getService()).zzh(new zzy(zzabVar, (TaskCompletionSource) obj2), str);
            }
        }).m17951e(1514).m17947a());
    }
}
