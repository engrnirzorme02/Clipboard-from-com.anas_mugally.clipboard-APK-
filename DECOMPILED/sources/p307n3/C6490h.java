package p307n3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.InterfaceC3643m;
import com.google.android.gms.common.api.Status;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: n3.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C6490h extends AbstractC1945a implements InterfaceC3643m {
    public static final Parcelable.Creator<C6490h> CREATOR = new C6491i();

    /* JADX INFO: renamed from: a */
    private final List f24551a;

    /* JADX INFO: renamed from: b */
    private final String f24552b;

    public C6490h(List list, String str) {
        this.f24551a = list;
        this.f24552b = str;
    }

    @Override // com.google.android.gms.common.api.InterfaceC3643m
    public final Status getStatus() {
        return this.f24552b != null ? Status.f14513f : Status.f14517u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        List list = this.f24551a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8046G(parcel, 1, list, false);
        AbstractC1947c.m8044E(parcel, 2, this.f24552b, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
