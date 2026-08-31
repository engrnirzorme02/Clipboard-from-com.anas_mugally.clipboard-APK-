package p142S2;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p409authapi.zbb;
import com.google.android.gms.internal.p409authapi.zbc;

/* JADX INFO: renamed from: S2.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1408s extends zbb implements InterfaceC1409t {
    public AbstractBinderC1408s() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.p409authapi.zbb
    protected final boolean zba(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) zbc.zba(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbd(parcel);
                mo5981v(googleSignInAccount, status);
                break;
            case 102:
                Status status2 = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbd(parcel);
                mo5979W(status2);
                break;
            case 103:
                Status status3 = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbd(parcel);
                mo5980i0(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
