package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;

/* JADX INFO: renamed from: h3.o */
/* JADX INFO: loaded from: classes.dex */
public class C5621o implements Parcelable {
    public static final Parcelable.Creator<C5621o> CREATOR = new C5562D0();

    /* JADX INFO: renamed from: a */
    private final InterfaceC5593a f21534a;

    /* JADX INFO: renamed from: h3.o$a */
    public static class a extends Exception {
        public a(int i7) {
            super("Algorithm with COSE value " + i7 + " not supported");
        }
    }

    C5621o(InterfaceC5593a interfaceC5593a) {
        this.f21534a = (InterfaceC5593a) AbstractC3718s.m18083l(interfaceC5593a);
    }

    /* JADX INFO: renamed from: a */
    public static C5621o m25063a(int i7) throws a {
        InterfaceC5593a interfaceC5593a;
        if (i7 != EnumC5557B.LEGACY_RS1.mo24993c()) {
            for (EnumC5557B enumC5557B : EnumC5557B.values()) {
                if (enumC5557B.mo24993c() == i7) {
                    interfaceC5593a = enumC5557B;
                }
            }
            for (EnumC5623p enumC5623p : EnumC5623p.values()) {
                if (enumC5623p.mo24993c() == i7) {
                    interfaceC5593a = enumC5623p;
                }
            }
            throw new a(i7);
        }
        interfaceC5593a = EnumC5557B.RS1;
        return new C5621o(interfaceC5593a);
    }

    /* JADX INFO: renamed from: b */
    public int m25064b() {
        return this.f21534a.mo24993c();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5621o) && this.f21534a.mo24993c() == ((C5621o) obj).f21534a.mo24993c();
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f21534a);
    }

    public final String toString() {
        return "COSEAlgorithmIdentifier{algorithm=" + String.valueOf(this.f21534a) + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f21534a.mo24993c());
    }
}
