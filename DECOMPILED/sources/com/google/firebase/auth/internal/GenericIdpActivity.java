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
import com.google.android.gms.internal.p411firebaseauthapi.zzagi;
import com.google.android.gms.internal.p411firebaseauthapi.zzagl;
import com.google.android.gms.internal.p411firebaseauthapi.zzajb;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.GenericIdpActivity;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p164V3.C1762g;
import p177X2.AbstractC1949e;
import p192Z3.AbstractC2107V;
import p192Z3.AbstractC2137o;
import p192Z3.C2090D;
import p192Z3.C2109X;
import p192Z3.C2113a0;
import p192Z3.C2115b0;
import p192Z3.C2117c0;
import p211b5.InterfaceC2972b;
import p330q0.C6801a;

/* JADX INFO: loaded from: classes.dex */
public class GenericIdpActivity extends AbstractActivityC2592j implements zzaes {

    /* JADX INFO: renamed from: N */
    private static long f18525N;

    /* JADX INFO: renamed from: O */
    private static final C2109X f18526O = C2109X.m8671c();

    /* JADX INFO: renamed from: M */
    private boolean f18527M = false;

    /* JADX INFO: renamed from: O0 */
    private final Uri.Builder m22040O0(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String strJoin = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        String strM22041P0 = m22041P0(intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS"));
        String string = UUID.randomUUID().toString();
        String strZza = zzaer.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        C2113a0.m8676a().m8681e(getApplicationContext(), str, string, strZza, action, stringExtra2, stringExtra3, stringExtra4);
        String strM8687b = C2115b0.m8686a(getApplicationContext(), C1762g.m7395n(stringExtra4).m7408q()).m8687b();
        if (TextUtils.isEmpty(strM8687b)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            m22042Q0(AbstractC2137o.m8742a("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        }
        if (strZza == null) {
            return null;
        }
        builder.appendQueryParameter("eid", "p").appendQueryParameter("v", "X" + stringExtra5).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", strZza).appendQueryParameter("eventId", string).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strM8687b);
        if (!TextUtils.isEmpty(strJoin)) {
            builder.appendQueryParameter("scopes", strJoin);
        }
        if (!TextUtils.isEmpty(strM22041P0)) {
            builder.appendQueryParameter("customParameters", strM22041P0);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            builder.appendQueryParameter("tid", stringExtra3);
        }
        return builder;
    }

    /* JADX INFO: renamed from: P0 */
    private static String m22041P0(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put(str, string);
                }
            }
        } catch (JSONException unused) {
            Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m22042Q0(Status status) {
        f18525N = 0L;
        this.f18527M = false;
        Intent intent = new Intent();
        AbstractC2107V.m8670b(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (m22044S0(intent)) {
            f18526O.m8672a(this);
        } else {
            C2090D.m8627b(getApplicationContext(), status);
        }
        finish();
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m22043R0(GenericIdpActivity genericIdpActivity, String str, Task task) {
        if (genericIdpActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
            Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
            zzaer.zzb(genericIdpActivity, str);
            return;
        }
        List<ResolveInfo> listQueryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
            C2381d c2381dM10208a = new C2381d.d().m10208a();
            Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
            c2381dM10208a.m10201a(genericIdpActivity, (Uri) task.getResult());
        } else {
            Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
            intent.putExtra("com.android.browser.application_id", str);
            Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            genericIdpActivity.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: S0 */
    private final boolean m22044S0(Intent intent) {
        return C6801a.m29840b(this).m29842c(intent);
    }

    /* JADX INFO: renamed from: T0 */
    private final void m22045T0() {
        f18525N = 0L;
        this.f18527M = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (m22044S0(intent)) {
            f18526O.m8672a(this);
        } else {
            C2090D.m8627b(this, AbstractC2137o.m8742a("WEB_CONTEXT_CANCELED"));
        }
        finish();
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("GenericIdpActivity", "Could not do operation - unknown action: " + action);
            m22045T0();
            return;
        }
        long jMo18159a = C3753h.m18171d().mo18159a();
        if (jMo18159a - f18525N < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        f18525N = jMo18159a;
        if (bundle != null) {
            this.f18527M = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
        }
    }

    @Override // p223d.AbstractActivityC5187q, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onResume() {
        GenericIdpActivity genericIdpActivity;
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.f18527M) {
                m22045T0();
                return;
            }
            String packageName = getPackageName();
            try {
                String lowerCase = AbstractC3755j.m18183b(AbstractC3746a.m18142a(this, packageName)).toLowerCase(Locale.US);
                C1762g c1762gM7395n = C1762g.m7395n(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c1762gM7395n);
                if (zzagl.zza(c1762gM7395n)) {
                    genericIdpActivity = this;
                    zza(m22040O0(Uri.parse(zzagl.zza(c1762gM7395n.m7407p().m7422b())).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.m21983A());
                } else {
                    genericIdpActivity = this;
                    new zzaeq(packageName, lowerCase, getIntent(), c1762gM7395n, genericIdpActivity).executeOnExecutor(firebaseAuth.m21986D(), new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e7) {
                genericIdpActivity = this;
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName + " " + String.valueOf(e7));
                zzaer.zzb(this, packageName);
            }
            genericIdpActivity.f18527M = true;
            return;
        }
        Intent intent = getIntent();
        if (intent.hasExtra("firebaseError")) {
            m22042Q0(AbstractC2107V.m8669a(intent.getStringExtra("firebaseError")));
            return;
        }
        if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
            m22045T0();
            return;
        }
        String stringExtra = intent.getStringExtra("link");
        String stringExtra2 = intent.getStringExtra("eventId");
        String packageName2 = getPackageName();
        boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
        C2117c0 c2117c0M8679b = C2113a0.m8676a().m8679b(this, packageName2, stringExtra2);
        if (c2117c0M8679b == null) {
            m22045T0();
        }
        if (booleanExtra) {
            stringExtra = C2115b0.m8686a(getApplicationContext(), C1762g.m7395n(c2117c0M8679b.m8689a()).m7408q()).m8688c(stringExtra);
        }
        zzajb zzajbVar = new zzajb(c2117c0M8679b, stringExtra);
        String strM8693e = c2117c0M8679b.m8693e();
        String strM8690b = c2117c0M8679b.m8690b();
        zzajbVar.zzb(strM8693e);
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(strM8690b) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(strM8690b) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(strM8690b)) {
            Log.e("GenericIdpActivity", "unsupported operation: " + strM8690b);
            m22045T0();
            return;
        }
        f18525N = 0L;
        this.f18527M = false;
        Intent intent2 = new Intent();
        AbstractC1949e.m8083e(zzajbVar, intent2, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
        intent2.putExtra("com.google.firebase.auth.internal.OPERATION", strM8690b);
        intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (m22044S0(intent2)) {
            f18526O.m8672a(this);
        } else {
            C2090D.m8628c(getApplicationContext(), zzajbVar, strM8690b, strM8693e);
        }
        finish();
    }

    @Override // p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f18527M);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaes
    public final Context zza() {
        return getApplicationContext();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaes
    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return m22040O0(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaes
    public final String zza(String str) {
        String strZza = zzagi.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(strZza)) {
            return zzagl.zzb(str);
        }
        Log.e("GenericIdpActivity", "Found hermetic configuration for identityToolkit URL: " + strZza);
        return strZza;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaes
    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zza.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaes
    public final void zza(String str, Status status) {
        if (status == null) {
            m22045T0();
        } else {
            m22042Q0(status);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaes
    public final void zza(Uri uri, final String str, InterfaceC2972b interfaceC2972b) {
        AbstractC2263x.m9328a(interfaceC2972b.get());
        Tasks.forResult(uri).addOnCompleteListener(new OnCompleteListener() { // from class: Z3.y
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                GenericIdpActivity.m22043R0(this.f6996a, str, task);
            }
        });
    }
}
