package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3731y0 extends zza implements InterfaceC3702k {
    C3731y0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3702k
    public final Account zzb() {
        Parcel parcelZzB = zzB(2, zza());
        Account account = (Account) zzc.zza(parcelZzB, Account.CREATOR);
        parcelZzB.recycle();
        return account;
    }
}
