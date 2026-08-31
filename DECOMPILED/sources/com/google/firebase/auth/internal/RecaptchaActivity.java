package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.AbstractC2263x;
import androidx.browser.customtabs.C2381d;
import androidx.fragment.app.AbstractActivityC2592j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.AbstractC3746a;
import com.google.android.gms.common.util.AbstractC3755j;
import com.google.android.gms.common.util.C3753h;
import com.google.android.gms.internal.p411firebaseauthapi.zza;
import com.google.android.gms.internal.p411firebaseauthapi.zzaeq;
import com.google.android.gms.internal.p411firebaseauthapi.zzaer;
import com.google.android.gms.internal.p411firebaseauthapi.zzaes;
import com.google.android.gms.internal.p411firebaseauthapi.zzafd;
import com.google.android.gms.internal.p411firebaseauthapi.zzagi;
import com.google.android.gms.internal.p411firebaseauthapi.zzagl;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import p164V3.C1762g;
import p192Z3.AbstractC2107V;
import p192Z3.AbstractC2137o;
import p192Z3.C2090D;
import p192Z3.C2109X;
import p192Z3.C2113a0;
import p192Z3.C2115b0;
import p211b5.InterfaceC2972b;
import p330q0.C6801a;

/* JADX INFO: loaded from: classes.dex */
public class RecaptchaActivity extends AbstractActivityC2592j implements zzaes {

    /* JADX INFO: renamed from: N */
    private static final String f18528N = "RecaptchaActivity";

    /* JADX INFO: renamed from: O */
    private static long f18529O;

    /* JADX INFO: renamed from: P */
    private static final C2109X f18530P = C2109X.m8671c();

    /* JADX INFO: renamed from: M */
    private boolean f18531M = false;

    /* JADX INFO: renamed from: O0 */
    private final Uri.Builder m22046O0(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String string = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        C1762g c1762gM7395n = C1762g.m7395n(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c1762gM7395n);
        C2113a0.m8676a().m8680d(getApplicationContext(), str, string, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA", stringExtra3);
        String strM8687b = C2115b0.m8686a(getApplicationContext(), c1762gM7395n.m7408q()).m8687b();
        if (TextUtils.isEmpty(strM8687b)) {
            Log.e(f18528N, "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            m22047P0(AbstractC2137o.m8742a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        builder.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", !TextUtils.isEmpty(firebaseAuth.m21991g()) ? firebaseAuth.m21991g() : zzafd.zza()).appendQueryParameter("eventId", string).appendQueryParameter("v", "X" + stringExtra2).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strM8687b);
        return builder;
    }

    /* JADX INFO: renamed from: P0 */
    private final void m22047P0(Status status) {
        f18529O = 0L;
        this.f18531M = false;
        Intent intent = new Intent();
        AbstractC2107V.m8670b(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        m22049R0(intent);
        f18530P.m8672a(this);
        finish();
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m22048Q0(RecaptchaActivity recaptchaActivity, String str, Task task) {
        if (recaptchaActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
            Log.e(f18528N, "Device cannot resolve intent for: android.intent.action.VIEW");
            zzaer.zzb(recaptchaActivity, str);
            return;
        }
        List<ResolveInfo> listQueryIntentServices = recaptchaActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
            C2381d c2381dM10208a = new C2381d.d().m10208a();
            c2381dM10208a.f8406a.addFlags(1073741824);
            c2381dM10208a.f8406a.addFlags(268435456);
            c2381dM10208a.m10201a(recaptchaActivity, (Uri) task.getResult());
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
        intent.putExtra("com.android.browser.application_id", str);
        intent.addFlags(1073741824);
        intent.addFlags(268435456);
        recaptchaActivity.startActivity(intent);
    }

    /* JADX INFO: renamed from: R0 */
    private final boolean m22049R0(Intent intent) {
        return C6801a.m29840b(this).m29842c(intent);
    }

    /* JADX INFO: renamed from: S0 */
    private final void m22050S0() {
        f18529O = 0L;
        this.f18531M = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        m22049R0(intent);
        f18530P.m8672a(this);
        finish();
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e(f18528N, "Could not do operation - unknown action: " + action);
            m22050S0();
            return;
        }
        long jMo18159a = C3753h.m18171d().mo18159a();
        if (jMo18159a - f18529O < 30000) {
            Log.e(f18528N, "Could not start operation - already in progress");
            return;
        }
        f18529O = jMo18159a;
        if (bundle != null) {
            this.f18531M = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
        }
    }

    @Override // p223d.AbstractActivityC5187q, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onResume() {
        RecaptchaActivity recaptchaActivity;
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.f18531M) {
                m22050S0();
                return;
            }
            Intent intent = getIntent();
            String packageName = getPackageName();
            try {
                String lowerCase = AbstractC3755j.m18183b(AbstractC3746a.m18142a(this, packageName)).toLowerCase(Locale.US);
                C1762g c1762gM7395n = C1762g.m7395n(intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c1762gM7395n);
                if (zzagl.zza(c1762gM7395n)) {
                    recaptchaActivity = this;
                    zza(m22046O0(Uri.parse(zzagl.zza(c1762gM7395n.m7407p().m7422b())).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.m21983A());
                } else {
                    recaptchaActivity = this;
                    new zzaeq(packageName, lowerCase, intent, c1762gM7395n, recaptchaActivity).executeOnExecutor(firebaseAuth.m21986D(), new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e7) {
                recaptchaActivity = this;
                Log.e(f18528N, "Could not get package signature: " + packageName + " " + String.valueOf(e7));
                zzaer.zzb(this, packageName);
            }
            recaptchaActivity.f18531M = true;
            return;
        }
        Intent intent2 = getIntent();
        if (intent2.hasExtra("firebaseError")) {
            m22047P0(AbstractC2107V.m8669a(intent2.getStringExtra("firebaseError")));
            return;
        }
        if (!intent2.hasExtra("link") || !intent2.hasExtra("eventId")) {
            m22050S0();
            return;
        }
        String stringExtra = intent2.getStringExtra("link");
        String strM8682g = C2113a0.m8676a().m8682g(getApplicationContext(), getPackageName(), intent2.getStringExtra("eventId"));
        if (TextUtils.isEmpty(strM8682g)) {
            Log.e(f18528N, "Failed to find registration for this event - failing to prevent session injection.");
            m22047P0(AbstractC2137o.m8742a("Failed to find registration for this reCAPTCHA event"));
        }
        if (intent2.getBooleanExtra("encryptionEnabled", true)) {
            stringExtra = C2115b0.m8686a(getApplicationContext(), C1762g.m7395n(strM8682g).m7408q()).m8688c(stringExtra);
        }
        String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
        f18529O = 0L;
        this.f18531M = false;
        Intent intent3 = new Intent();
        intent3.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
        intent3.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent3.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (m22049R0(intent3)) {
            f18530P.m8672a(this);
        } else {
            C2090D.m8629d(getApplicationContext(), queryParameter, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        }
        finish();
    }

    @Override // p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f18531M);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaes
    public final Context zza() {
        return getApplicationContext();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaes
    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return m22046O0(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaes
    public final String zza(String str) {
        String strZza = zzagi.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(strZza)) {
            return zzagl.zzb(str);
        }
        Log.e(f18528N, "Found hermetic configuration for identityToolkit URL: " + strZza);
        return strZza;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaes
    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zza.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            zzaes.zza.m8615c("Error generating connection", new Object[0]);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaes
    public final void zza(String str, Status status) {
        if (status == null) {
            m22050S0();
        } else {
            m22047P0(status);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaes
    public final void zza(Uri uri, final String str, InterfaceC2972b interfaceC2972b) {
        AbstractC2263x.m9328a(interfaceC2972b.get());
        Tasks.forResult(uri).addOnCompleteListener(new OnCompleteListener() { // from class: Z3.F
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                RecaptchaActivity.m22048Q0(this.f6886a, str, task);
            }
        });
    }
}
