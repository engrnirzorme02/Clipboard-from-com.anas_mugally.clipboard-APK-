package com.google.android.gms.internal.auth_blockstore;

import android.content.Context;
import com.google.android.gms.common.api.AbstractC3559g;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.api.internal.AbstractC3632w;
import com.google.android.gms.common.api.internal.InterfaceC3622r;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p149T2.C1461a;
import p149T2.C1462b;
import p149T2.C1463c;
import p149T2.C1464d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaa extends AbstractC3559g {
    private static final C3553a.g zza;
    private static final C3553a.a zzb;
    private static final C3553a zzc;

    static {
        C3553a.g gVar = new C3553a.g();
        zza = gVar;
        zzu zzuVar = new zzu();
        zzb = zzuVar;
        zzc = new C3553a("Blockstore.API", zzuVar, gVar);
    }

    public zzaa(Context context) {
        super(context, zzc, C3553a.d.f14527n, AbstractC3559g.a.f14540c);
    }

    public final Task<Boolean> deleteBytes(final C1461a c1461a) {
        AbstractC3718s.m18084m(c1461a, "DeleteBytesRequest cannot be null");
        return doWrite(AbstractC3632w.m17942a().m17950d(zzab.zzg).m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth_blockstore.zzp
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzf) obj).getService()).zza(new zzy(this.zza, (TaskCompletionSource) obj2), c1461a);
            }
        }).m17949c(false).m17951e(1669).m17947a());
    }

    public final Task<Boolean> isEndToEndEncryptionAvailable() {
        return doRead(AbstractC3632w.m17942a().m17950d(zzab.zze).m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth_blockstore.zzr
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzf) obj).getService()).zzb(new zzz(this.zza, (TaskCompletionSource) obj2));
            }
        }).m17949c(false).m17951e(1651).m17947a());
    }

    public final Task<byte[]> retrieveBytes() {
        return doRead(AbstractC3632w.m17942a().m17950d(zzab.zza).m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth_blockstore.zzt
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzf) obj).getService()).zzc(new zzx(this.zza, (TaskCompletionSource) obj2));
            }
        }).m17949c(false).m17951e(1570).m17947a());
    }

    public final Task<Integer> storeBytes(final C1464d c1464d) {
        return doWrite(AbstractC3632w.m17942a().m17950d(zzab.zzd, zzab.zzf).m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth_blockstore.zzq
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzf) obj).getService()).zze(new zzv(this.zza, (TaskCompletionSource) obj2), c1464d);
            }
        }).m17951e(1645).m17949c(false).m17947a());
    }

    public final Task<C1463c> retrieveBytes(final C1462b c1462b) {
        AbstractC3718s.m18084m(c1462b, "RetrieveBytesRequest cannot be null");
        return doRead(AbstractC3632w.m17942a().m17950d(zzab.zzh).m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth_blockstore.zzs
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzf) obj).getService()).zzd(new zzw(this.zza, (TaskCompletionSource) obj2), c1462b);
            }
        }).m17949c(false).m17951e(1668).m17947a());
    }
}
