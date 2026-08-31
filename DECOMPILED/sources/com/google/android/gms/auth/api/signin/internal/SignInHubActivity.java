package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.AbstractActivityC2592j;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import p142S2.C1405p;

/* JADX INFO: loaded from: classes.dex */
public class SignInHubActivity extends AbstractActivityC2592j {

    /* JADX INFO: renamed from: R */
    private static boolean f14501R = false;

    /* JADX INFO: renamed from: M */
    private boolean f14502M = false;

    /* JADX INFO: renamed from: N */
    private SignInConfiguration f14503N;

    /* JADX INFO: renamed from: O */
    private boolean f14504O;

    /* JADX INFO: renamed from: P */
    private int f14505P;

    /* JADX INFO: renamed from: Q */
    private Intent f14506Q;

    /* JADX INFO: renamed from: Q0 */
    private final void m17735Q0(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.f14503N);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f14502M = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            m17737S0(17);
        }
    }

    /* JADX INFO: renamed from: R0 */
    private final void m17736R0() {
        m12233I0().mo12683c(0, null, new C3552a(this, null));
        f14501R = false;
    }

    /* JADX INFO: renamed from: S0 */
    private final void m17737S0(int i7) {
        Status status = new Status(i7);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f14501R = false;
    }

    /* JADX INFO: renamed from: O0 */
    final /* synthetic */ int m17738O0() {
        return this.f14505P;
    }

    /* JADX INFO: renamed from: P0 */
    final /* synthetic */ Intent m17739P0() {
        return this.f14506Q;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, android.app.Activity
    protected final void onActivityResult(int i7, int i8, Intent intent) {
        if (this.f14502M) {
            return;
        }
        setResult(0);
        if (i7 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && signInAccount.m17726T() != null) {
                GoogleSignInAccount googleSignInAccountM17726T = signInAccount.m17726T();
                if (googleSignInAccountM17726T == null) {
                    Log.e("AuthSignInClient", "Google account is null");
                    m17737S0(12500);
                    return;
                }
                C1405p.m5993a(this).m5996c(this.f14503N.m17734T(), googleSignInAccountM17726T);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccountM17726T);
                this.f14504O = true;
                this.f14505P = i8;
                this.f14506Q = intent;
                m17736R0();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                m17737S0(intExtra);
                return;
            }
        }
        m17737S0(8);
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            m17737S0(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            m17737S0(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f14503N = signInConfiguration;
        if (bundle == null) {
            if (f14501R) {
                setResult(0);
                m17737S0(12502);
                return;
            } else {
                f14501R = true;
                m17735Q0(action);
                return;
            }
        }
        boolean z7 = bundle.getBoolean("signingInGoogleApiClients");
        this.f14504O = z7;
        if (z7) {
            this.f14505P = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
            if (intent2 != null) {
                this.f14506Q = intent2;
                m17736R0();
            } else {
                Log.e("AuthSignInClient", "Sign in result data cannot be null");
                setResult(0);
                finish();
            }
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f14501R = false;
    }

    @Override // p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f14504O);
        if (this.f14504O) {
            bundle.putInt("signInResultCode", this.f14505P);
            bundle.putParcelable("signInResultData", this.f14506Q);
        }
    }
}
