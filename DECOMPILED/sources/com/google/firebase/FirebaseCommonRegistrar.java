package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import p193Z4.C2154f;
import p285k5.AbstractC6070e;
import p285k5.AbstractC6073h;
import p285k5.C6068c;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m21951a(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? m21955e(installerPackageName) : "";
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m21952b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m21953c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m21954d(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        return context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
    }

    /* JADX INFO: renamed from: e */
    private static String m21955e(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C6068c.m27104c());
        arrayList.add(C2154f.m8760g());
        arrayList.add(AbstractC6073h.m27112b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(AbstractC6073h.m27112b("fire-core", "22.0.1"));
        arrayList.add(AbstractC6073h.m27112b("device-name", m21955e(Build.PRODUCT)));
        arrayList.add(AbstractC6073h.m27112b("device-model", m21955e(Build.DEVICE)));
        arrayList.add(AbstractC6073h.m27112b("device-brand", m21955e(Build.BRAND)));
        arrayList.add(AbstractC6073h.m27113c("android-target-sdk", new AbstractC6073h.a() { // from class: V3.i
            @Override // p285k5.AbstractC6073h.a
            /* JADX INFO: renamed from: a */
            public final String mo7417a(Object obj) {
                return FirebaseCommonRegistrar.m21953c((Context) obj);
            }
        }));
        arrayList.add(AbstractC6073h.m27113c("android-min-sdk", new AbstractC6073h.a() { // from class: V3.j
            @Override // p285k5.AbstractC6073h.a
            /* JADX INFO: renamed from: a */
            public final String mo7417a(Object obj) {
                return FirebaseCommonRegistrar.m21952b((Context) obj);
            }
        }));
        arrayList.add(AbstractC6073h.m27113c("android-platform", new AbstractC6073h.a() { // from class: V3.k
            @Override // p285k5.AbstractC6073h.a
            /* JADX INFO: renamed from: a */
            public final String mo7417a(Object obj) {
                return FirebaseCommonRegistrar.m21954d((Context) obj);
            }
        }));
        arrayList.add(AbstractC6073h.m27113c("android-installer", new AbstractC6073h.a() { // from class: V3.l
            @Override // p285k5.AbstractC6073h.a
            /* JADX INFO: renamed from: a */
            public final String mo7417a(Object obj) {
                return FirebaseCommonRegistrar.m21951a((Context) obj);
            }
        }));
        String strM27109a = AbstractC6070e.m27109a();
        if (strM27109a != null) {
            arrayList.add(AbstractC6073h.m27112b("kotlin", strM27109a));
        }
        return arrayList;
    }
}
