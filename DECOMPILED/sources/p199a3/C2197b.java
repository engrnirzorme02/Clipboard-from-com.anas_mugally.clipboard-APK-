package p199a3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.AbstractC3734a;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: a3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2197b extends AbstractC1945a {
    public static final Parcelable.Creator<C2197b> CREATOR = new C2198c();

    /* JADX INFO: renamed from: a */
    final int f7128a;

    /* JADX INFO: renamed from: b */
    private final C2196a f7129b;

    C2197b(int i7, C2196a c2196a) {
        this.f7128a = i7;
        this.f7129b = c2196a;
    }

    /* JADX INFO: renamed from: T */
    public static C2197b m8938T(AbstractC3734a.b bVar) {
        if (bVar instanceof C2196a) {
            return new C2197b((C2196a) bVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    /* JADX INFO: renamed from: U */
    public final AbstractC3734a.b m8939U() {
        C2196a c2196a = this.f7129b;
        if (c2196a != null) {
            return c2196a;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f7128a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        AbstractC1947c.m8042C(parcel, 2, this.f7129b, i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    private C2197b(C2196a c2196a) {
        this.f7128a = 1;
        this.f7129b = c2196a;
    }
}
