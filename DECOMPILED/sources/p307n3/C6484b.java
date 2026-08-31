package p307n3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.InterfaceC3643m;
import com.google.android.gms.common.api.Status;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: n3.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C6484b extends AbstractC1945a implements InterfaceC3643m {
    public static final Parcelable.Creator<C6484b> CREATOR = new C6485c();

    /* JADX INFO: renamed from: a */
    final int f24548a;

    /* JADX INFO: renamed from: b */
    private int f24549b;

    /* JADX INFO: renamed from: c */
    private Intent f24550c;

    C6484b(int i7, int i8, Intent intent) {
        this.f24548a = i7;
        this.f24549b = i8;
        this.f24550c = intent;
    }

    @Override // com.google.android.gms.common.api.InterfaceC3643m
    public final Status getStatus() {
        return this.f24549b == 0 ? Status.f14513f : Status.f14517u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f24548a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        AbstractC1947c.m8072t(parcel, 2, this.f24549b);
        AbstractC1947c.m8042C(parcel, 3, this.f24550c, i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
