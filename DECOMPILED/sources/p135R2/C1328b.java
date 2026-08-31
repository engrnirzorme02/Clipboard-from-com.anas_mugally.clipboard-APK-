package p135R2;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.InterfaceC3643m;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: R2.b */
/* JADX INFO: loaded from: classes.dex */
public class C1328b implements InterfaceC3643m {

    /* JADX INFO: renamed from: a */
    private final Status f4638a;

    /* JADX INFO: renamed from: b */
    private final GoogleSignInAccount f4639b;

    public C1328b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f4639b = googleSignInAccount;
        this.f4638a = status;
    }

    /* JADX INFO: renamed from: a */
    public GoogleSignInAccount m5691a() {
        return this.f4639b;
    }

    @Override // com.google.android.gms.common.api.InterfaceC3643m
    public Status getStatus() {
        return this.f4638a;
    }
}
