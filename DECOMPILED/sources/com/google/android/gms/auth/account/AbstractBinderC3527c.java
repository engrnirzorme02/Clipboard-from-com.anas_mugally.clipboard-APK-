package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zzb;
import com.google.android.gms.internal.auth.zzc;

/* JADX INFO: renamed from: com.google.android.gms.auth.account.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3527c extends zzb implements InterfaceC3528d {
    public AbstractBinderC3527c() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            if (i7 != 2) {
                return false;
            }
            int i9 = zzc.zza;
            int i10 = parcel.readInt();
            zzc.zzb(parcel);
            zzc(i10 != 0);
        } else {
            Account account = (Account) zzc.zza(parcel, Account.CREATOR);
            zzc.zzb(parcel);
            zzb(account);
        }
        return true;
    }
}
