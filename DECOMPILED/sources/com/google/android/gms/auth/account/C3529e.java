package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzc;

/* JADX INFO: renamed from: com.google.android.gms.auth.account.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3529e extends zza implements InterfaceC3531g {
    C3529e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.google.android.gms.auth.account.InterfaceC3531g
    /* JADX INFO: renamed from: s0 */
    public final void mo17637s0(InterfaceC3528d interfaceC3528d, String str) {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, interfaceC3528d);
        parcelZza.writeString(str);
        zzc(2, parcelZza);
    }

    @Override // com.google.android.gms.auth.account.InterfaceC3531g
    /* JADX INFO: renamed from: u0 */
    public final void mo17638u0(InterfaceC3528d interfaceC3528d, Account account) {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, interfaceC3528d);
        zzc.zzc(parcelZza, account);
        zzc(3, parcelZza);
    }

    @Override // com.google.android.gms.auth.account.InterfaceC3531g
    public final void zzf(boolean z7) {
        Parcel parcelZza = zza();
        int i7 = zzc.zza;
        parcelZza.writeInt(z7 ? 1 : 0);
        zzc(1, parcelZza);
    }
}
