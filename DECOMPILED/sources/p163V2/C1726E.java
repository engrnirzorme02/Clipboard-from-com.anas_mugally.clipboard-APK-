package p163V2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.AbstractC3760o;
import java.util.List;
import p227d3.C5228d;

/* JADX INFO: renamed from: V2.E */
/* JADX INFO: loaded from: classes.dex */
public final class C1726E {

    /* JADX INFO: renamed from: a */
    private final Context f5732a;

    /* JADX INFO: renamed from: b */
    private int f5733b;

    /* JADX INFO: renamed from: c */
    private int f5734c = 0;

    public C1726E(Context context) {
        this.f5732a = context;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized int m7349a() {
        PackageInfo packageInfoM24152f;
        if (this.f5733b == 0) {
            try {
                packageInfoM24152f = C5228d.m24155a(this.f5732a).m24152f("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e7) {
                Log.w("Metadata", "Failed to find package ".concat(e7.toString()));
                packageInfoM24152f = null;
            }
            if (packageInfoM24152f != null) {
                this.f5733b = packageInfoM24152f.versionCode;
            }
        }
        return this.f5733b;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[Catch: all -> 0x0026, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x001d, B:14:0x0028, B:16:0x002f, B:18:0x0041, B:26:0x0062, B:21:0x0048, B:23:0x005b, B:29:0x0066, B:33:0x0075), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX INFO: renamed from: b */
    public final synchronized int m7350b() {
        List<ResolveInfo> listQueryBroadcastReceivers;
        int i7 = this.f5734c;
        if (i7 != 0) {
            return i7;
        }
        Context context = this.f5732a;
        PackageManager packageManager = context.getPackageManager();
        if (C5228d.m24155a(context).m24148b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i8 = 1;
        if (AbstractC3760o.m18199g()) {
            Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
            intent.setPackage("com.google.android.gms");
            listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
            if (listQueryBroadcastReceivers != null) {
            }
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (true != AbstractC3760o.m18199g()) {
                i8 = 2;
            }
            this.f5734c = i8;
            return i8;
        }
        Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent3.setPackage("com.google.android.gms");
            listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
            if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.isEmpty()) {
                Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
                if (true != AbstractC3760o.m18199g()) {
                    i8 = 2;
                }
                this.f5734c = i8;
                return i8;
            }
            i8 = 2;
        }
        this.f5734c = i8;
        return i8;
    }
}
