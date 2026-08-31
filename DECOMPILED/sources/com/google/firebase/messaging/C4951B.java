package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.privacysandbox.ads.adservices.measurement.ExecutorC2688k;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.AbstractC4947g;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import p163V2.C1732c;
import p164V3.C1762g;
import p193Z4.InterfaceC2158j;
import p211b5.InterfaceC2972b;
import p219c5.InterfaceC3022e;
import p285k5.InterfaceC6074i;

/* JADX INFO: renamed from: com.google.firebase.messaging.B */
/* JADX INFO: loaded from: classes.dex */
class C4951B {

    /* JADX INFO: renamed from: a */
    private final C1762g f18776a;

    /* JADX INFO: renamed from: b */
    private final C4957G f18777b;

    /* JADX INFO: renamed from: c */
    private final C1732c f18778c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC2972b f18779d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC2972b f18780e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC3022e f18781f;

    C4951B(C1762g c1762g, C4957G c4957g, InterfaceC2972b interfaceC2972b, InterfaceC2972b interfaceC2972b2, InterfaceC3022e interfaceC3022e) {
        this(c1762g, c4957g, new C1732c(c1762g.m7405l()), interfaceC2972b, interfaceC2972b2, interfaceC3022e);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m22245a(C4951B c4951b, Task task) {
        c4951b.getClass();
        return c4951b.m22249g((Bundle) task.getResult(IOException.class));
    }

    /* JADX INFO: renamed from: b */
    private static String m22246b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* JADX INFO: renamed from: c */
    private Task m22247c(Task task) {
        return task.continueWith(new ExecutorC2688k(), new Continuation() { // from class: com.google.firebase.messaging.A
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return C4951B.m22245a(this.f18775a, task2);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    private String m22248d() {
        try {
            return m22246b(MessageDigest.getInstance("SHA-1").digest(this.f18776a.m7406o().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* JADX INFO: renamed from: g */
    private String m22249g(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* JADX INFO: renamed from: h */
    static boolean m22250h(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* JADX INFO: renamed from: i */
    private void m22251i(String str, String str2, Bundle bundle) {
        InterfaceC2158j.a aVarMo8762b;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f18776a.m7407p().m7423c());
        bundle.putString("gmsv", Integer.toString(this.f18777b.m22346d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f18777b.m22344a());
        bundle.putString("app_ver_name", this.f18777b.m22345b());
        bundle.putString("firebase-app-name-hash", m22248d());
        try {
            String strMo22197b = ((AbstractC4947g) Tasks.await(this.f18781f.mo14992a(false))).mo22197b();
            if (TextUtils.isEmpty(strMo22197b)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strMo22197b);
            }
        } catch (InterruptedException e7) {
            e = e7;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e8) {
            e = e8;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) Tasks.await(this.f18781f.getId()));
        bundle.putString("cliv", "fcm-25.0.1");
        InterfaceC2158j interfaceC2158j = (InterfaceC2158j) this.f18780e.get();
        InterfaceC6074i interfaceC6074i = (InterfaceC6074i) this.f18779d.get();
        if (interfaceC2158j == null || interfaceC6074i == null || (aVarMo8762b = interfaceC2158j.mo8762b("fire-iid")) == InterfaceC2158j.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(aVarMo8762b.m8766d()));
        bundle.putString("Firebase-Client", interfaceC6074i.mo27106a());
    }

    /* JADX INFO: renamed from: k */
    private Task m22252k(String str, String str2, Bundle bundle) {
        try {
            m22251i(str, str2, bundle);
            return this.f18778c.m7368c(bundle);
        } catch (InterruptedException | ExecutionException e7) {
            return Tasks.forException(e7);
        }
    }

    /* JADX INFO: renamed from: e */
    Task m22253e() {
        return this.f18778c.m7366a();
    }

    /* JADX INFO: renamed from: f */
    Task m22254f() {
        return m22247c(m22252k(C4957G.m22341c(this.f18776a), "*", new Bundle()));
    }

    /* JADX INFO: renamed from: j */
    Task m22255j(boolean z7) {
        return this.f18778c.m7369d(z7);
    }

    /* JADX INFO: renamed from: l */
    Task m22256l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return m22247c(m22252k(str, "/topics/" + str2, bundle));
    }

    /* JADX INFO: renamed from: m */
    Task m22257m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return m22247c(m22252k(str, "/topics/" + str2, bundle));
    }

    C4951B(C1762g c1762g, C4957G c4957g, C1732c c1732c, InterfaceC2972b interfaceC2972b, InterfaceC2972b interfaceC2972b2, InterfaceC3022e interfaceC3022e) {
        this.f18776a = c1762g;
        this.f18777b = c4957g;
        this.f18778c = c1732c;
        this.f18779d = interfaceC2972b;
        this.f18780e = interfaceC2972b2;
        this.f18781f = interfaceC3022e;
    }
}
