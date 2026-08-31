package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzbn;
import java.util.ArrayList;
import java.util.List;
import p283k3.C6027J;
import p283k3.C6030a;
import p283k3.InterfaceC6033d;
import p283k3.InterfaceC6036g;
import p283k3.InterfaceC6039j;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.e2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4217e2 extends zzbl implements InterfaceC6033d {
    C4217e2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: D */
    public final void mo18724D(C4006B6 c4006b6) {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, c4006b6);
        zzc(25, parcelZza);
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: E */
    public final void mo18725E(C4006B6 c4006b6, Bundle bundle, InterfaceC6036g interfaceC6036g) {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, c4006b6);
        zzbn.zzc(parcelZza, bundle);
        zzbn.zzd(parcelZza, interfaceC6036g);
        zzc(31, parcelZza);
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: H0 */
    public final void mo18726H0(C4006B6 c4006b6) {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, c4006b6);
        zzc(20, parcelZza);
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: L */
    public final void mo18727L(C4039G c4039g, C4006B6 c4006b6) {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, c4039g);
        zzbn.zzc(parcelZza, c4006b6);
        zzc(1, parcelZza);
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: N */
    public final void mo18728N(C4006B6 c4006b6) {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, c4006b6);
        zzc(6, parcelZza);
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: O */
    public final void mo18729O(C4006B6 c4006b6) {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, c4006b6);
        zzc(26, parcelZza);
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: R */
    public final void mo18730R(C4006B6 c4006b6, C4230g c4230g) {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, c4006b6);
        zzbn.zzc(parcelZza, c4230g);
        zzc(30, parcelZza);
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: T */
    public final byte[] mo18731T(C4039G c4039g, String str) {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, c4039g);
        parcelZza.writeString(str);
        Parcel parcelZzP = zzP(9, parcelZza);
        byte[] bArrCreateByteArray = parcelZzP.createByteArray();
        parcelZzP.recycle();
        return bArrCreateByteArray;
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: Z */
    public final void mo18732Z(C4357v6 c4357v6, C4006B6 c4006b6) {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, c4357v6);
        zzbn.zzc(parcelZza, c4006b6);
        zzc(2, parcelZza);
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: a0 */
    public final C6030a mo18733a0(C4006B6 c4006b6) {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, c4006b6);
        Parcel parcelZzP = zzP(21, parcelZza);
        C6030a c6030a = (C6030a) zzbn.zzb(parcelZzP, C6030a.CREATOR);
        parcelZzP.recycle();
        return c6030a;
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: b0 */
    public final void mo18734b0(Bundle bundle, C4006B6 c4006b6) {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, bundle);
        zzbn.zzc(parcelZza, c4006b6);
        zzc(19, parcelZza);
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: d */
    public final List mo18735d(String str, String str2, String str3, boolean z7) {
        Parcel parcelZza = zza();
        parcelZza.writeString(null);
        parcelZza.writeString(str2);
        parcelZza.writeString(str3);
        int i7 = zzbn.zza;
        parcelZza.writeInt(z7 ? 1 : 0);
        Parcel parcelZzP = zzP(15, parcelZza);
        ArrayList arrayListCreateTypedArrayList = parcelZzP.createTypedArrayList(C4357v6.CREATOR);
        parcelZzP.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: e */
    public final void mo18736e(C4246i c4246i, C4006B6 c4006b6) {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, c4246i);
        zzbn.zzc(parcelZza, c4006b6);
        zzc(12, parcelZza);
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: k0 */
    public final void mo18737k0(C4006B6 c4006b6) {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, c4006b6);
        zzc(4, parcelZza);
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: q */
    public final void mo18738q(long j7, String str, String str2, String str3) {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j7);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeString(str3);
        zzc(10, parcelZza);
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: r0 */
    public final void mo18739r0(C4006B6 c4006b6) {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, c4006b6);
        zzc(27, parcelZza);
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: t0 */
    public final List mo18740t0(String str, String str2, boolean z7, C4006B6 c4006b6) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        int i7 = zzbn.zza;
        parcelZza.writeInt(z7 ? 1 : 0);
        zzbn.zzc(parcelZza, c4006b6);
        Parcel parcelZzP = zzP(14, parcelZza);
        ArrayList arrayListCreateTypedArrayList = parcelZzP.createTypedArrayList(C4357v6.CREATOR);
        parcelZzP.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: u */
    public final void mo18741u(C4006B6 c4006b6) {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, c4006b6);
        zzc(18, parcelZza);
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: w */
    public final void mo18742w(C4006B6 c4006b6, C6027J c6027j, InterfaceC6039j interfaceC6039j) {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, c4006b6);
        zzbn.zzc(parcelZza, c6027j);
        zzbn.zzd(parcelZza, interfaceC6039j);
        zzc(29, parcelZza);
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: x0 */
    public final String mo18743x0(C4006B6 c4006b6) {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, c4006b6);
        Parcel parcelZzP = zzP(11, parcelZza);
        String string = parcelZzP.readString();
        parcelZzP.recycle();
        return string;
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: y */
    public final List mo18744y(String str, String str2, String str3) {
        Parcel parcelZza = zza();
        parcelZza.writeString(null);
        parcelZza.writeString(str2);
        parcelZza.writeString(str3);
        Parcel parcelZzP = zzP(17, parcelZza);
        ArrayList arrayListCreateTypedArrayList = parcelZzP.createTypedArrayList(C4246i.CREATOR);
        parcelZzP.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p283k3.InterfaceC6033d
    /* JADX INFO: renamed from: y0 */
    public final List mo18745y0(String str, String str2, C4006B6 c4006b6) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbn.zzc(parcelZza, c4006b6);
        Parcel parcelZzP = zzP(16, parcelZza);
        ArrayList arrayListCreateTypedArrayList = parcelZzP.createTypedArrayList(C4246i.CREATOR);
        parcelZzP.recycle();
        return arrayListCreateTypedArrayList;
    }
}
