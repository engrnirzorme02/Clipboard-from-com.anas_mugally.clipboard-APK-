package p142S2;

import android.os.Parcel;
import com.google.android.gms.internal.p409authapi.zbb;

/* JADX INFO: renamed from: S2.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1406q extends zbb implements InterfaceC1407r {
    public AbstractBinderC1406q() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p409authapi.zbb
    protected final boolean zba(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            mo5997g();
        } else {
            if (i7 != 2) {
                return false;
            }
            mo5998s();
        }
        return true;
    }
}
