package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.play_billing.zzc;
import p403z1.AbstractC7583y;
import p403z1.C7559a;
import p403z1.C7567i;
import p403z1.InterfaceC7560b;
import p403z1.InterfaceC7562d;
import p403z1.InterfaceC7564f;
import p403z1.InterfaceC7565g;
import p403z1.InterfaceC7566h;

/* JADX INFO: renamed from: com.android.billingclient.api.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3175a {

    /* JADX INFO: renamed from: com.android.billingclient.api.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private volatile C3179e f13501a;

        /* JADX INFO: renamed from: b */
        private final Context f13502b;

        /* JADX INFO: renamed from: c */
        private volatile InterfaceC7566h f13503c;

        /* JADX INFO: renamed from: d */
        private volatile boolean f13504d;

        /* JADX INFO: renamed from: e */
        private volatile boolean f13505e;

        /* JADX INFO: renamed from: f */
        volatile boolean f13506f;

        /* synthetic */ a(Context context, AbstractC7583y abstractC7583y) {
            this.f13502b = context;
        }

        /* JADX INFO: renamed from: d */
        private final boolean m16805d() {
            try {
                Context context = this.f13502b;
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception e7) {
                zzc.zzo("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e7);
                return false;
            }
        }

        /* JADX INFO: renamed from: a */
        public AbstractC3175a m16806a() {
            Context context = this.f13502b;
            if (context == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f13503c == null) {
                if (this.f13504d || this.f13505e) {
                    return m16805d() ? new C3160H(null, context, null, null, this) : new C3176b(null, context, null, null, this);
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            if (this.f13501a == null || !this.f13501a.m16935a()) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            if (this.f13503c == null) {
                C3179e c3179e = this.f13501a;
                return m16805d() ? new C3160H(null, c3179e, context, null, null, null, this) : new C3176b(null, c3179e, context, null, null, null, this);
            }
            C3179e c3179e2 = this.f13501a;
            InterfaceC7566h interfaceC7566h = this.f13503c;
            return m16805d() ? new C3160H(null, c3179e2, context, interfaceC7566h, null, null, null, this) : new C3176b(null, c3179e2, context, interfaceC7566h, null, null, null, this);
        }

        /* JADX INFO: renamed from: b */
        public a m16807b(C3179e c3179e) {
            this.f13501a = c3179e;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m16808c(InterfaceC7566h interfaceC7566h) {
            this.f13503c = interfaceC7566h;
            return this;
        }
    }

    /* JADX INFO: renamed from: d */
    public static a m16802d(Context context) {
        return new a(context, null);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo16757a(C7559a c7559a, InterfaceC7560b interfaceC7560b);

    /* JADX INFO: renamed from: b */
    public abstract int mo16803b();

    /* JADX INFO: renamed from: c */
    public abstract C3178d mo16758c(Activity activity, C3177c c3177c);

    /* JADX INFO: renamed from: e */
    public abstract void mo16759e(C3181g c3181g, InterfaceC7564f interfaceC7564f);

    /* JADX INFO: renamed from: f */
    public abstract void mo16804f(C7567i c7567i, InterfaceC7565g interfaceC7565g);

    /* JADX INFO: renamed from: g */
    public abstract void mo16760g(InterfaceC7562d interfaceC7562d);
}
