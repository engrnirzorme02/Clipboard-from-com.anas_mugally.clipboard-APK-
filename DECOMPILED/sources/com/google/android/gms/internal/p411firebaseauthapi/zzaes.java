package com.google.android.gms.internal.p411firebaseauthapi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import java.net.HttpURLConnection;
import java.net.URL;
import p191Z2.C2086a;
import p211b5.InterfaceC2972b;

/* JADX INFO: loaded from: classes2.dex */
public interface zzaes {
    public static final C2086a zza = new C2086a("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    Context zza();

    Uri.Builder zza(Intent intent, String str, String str2);

    String zza(String str);

    HttpURLConnection zza(URL url);

    void zza(Uri uri, String str, InterfaceC2972b interfaceC2972b);

    void zza(String str, Status status);
}
