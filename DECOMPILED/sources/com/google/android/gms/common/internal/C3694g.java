package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p170W2.C1839d;
import p177X2.AbstractC1945a;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.g */
/* JADX INFO: loaded from: classes.dex */
public class C3694g extends AbstractC1945a {

    /* JADX INFO: renamed from: a */
    final int f14774a;

    /* JADX INFO: renamed from: b */
    final int f14775b;

    /* JADX INFO: renamed from: c */
    final int f14776c;

    /* JADX INFO: renamed from: d */
    String f14777d;

    /* JADX INFO: renamed from: e */
    IBinder f14778e;

    /* JADX INFO: renamed from: f */
    Scope[] f14779f;

    /* JADX INFO: renamed from: r */
    Bundle f14780r;

    /* JADX INFO: renamed from: s */
    Account f14781s;

    /* JADX INFO: renamed from: t */
    C1839d[] f14782t;

    /* JADX INFO: renamed from: u */
    C1839d[] f14783u;

    /* JADX INFO: renamed from: v */
    final boolean f14784v;

    /* JADX INFO: renamed from: w */
    final int f14785w;

    /* JADX INFO: renamed from: x */
    boolean f14786x;

    /* JADX INFO: renamed from: y */
    private final String f14787y;
    public static final Parcelable.Creator<C3694g> CREATOR = new C3713p0();

    /* JADX INFO: renamed from: z */
    static final Scope[] f14773z = new Scope[0];

    /* JADX INFO: renamed from: A */
    static final C1839d[] f14772A = new C1839d[0];

    C3694g(int i7, int i8, int i9, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C1839d[] c1839dArr, C1839d[] c1839dArr2, boolean z7, int i10, boolean z8, String str2) {
        scopeArr = scopeArr == null ? f14773z : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        c1839dArr = c1839dArr == null ? f14772A : c1839dArr;
        c1839dArr2 = c1839dArr2 == null ? f14772A : c1839dArr2;
        this.f14774a = i7;
        this.f14775b = i8;
        this.f14776c = i9;
        if ("com.google.android.gms".equals(str)) {
            this.f14777d = "com.google.android.gms";
        } else {
            this.f14777d = str;
        }
        if (i7 < 2) {
            this.f14781s = iBinder != null ? AbstractBinderC3682a.m17998M0(InterfaceC3702k.a.m18048L0(iBinder)) : null;
        } else {
            this.f14778e = iBinder;
            this.f14781s = account;
        }
        this.f14779f = scopeArr;
        this.f14780r = bundle;
        this.f14782t = c1839dArr;
        this.f14783u = c1839dArr2;
        this.f14784v = z7;
        this.f14785w = i10;
        this.f14786x = z8;
        this.f14787y = str2;
    }

    /* JADX INFO: renamed from: T */
    public String m18027T() {
        return this.f14787y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        C3713p0.m18051a(this, parcel, i7);
    }
}
