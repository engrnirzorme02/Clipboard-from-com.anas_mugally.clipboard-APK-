package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import p177X2.AbstractC1945a;

/* JADX INFO: renamed from: com.google.firebase.messaging.P */
/* JADX INFO: loaded from: classes.dex */
public final class C4966P extends AbstractC1945a {
    public static final Parcelable.Creator<C4966P> CREATOR = new C4967Q();

    /* JADX INFO: renamed from: a */
    Bundle f18821a;

    /* JADX INFO: renamed from: b */
    private Map f18822b;

    /* JADX INFO: renamed from: c */
    private b f18823c;

    /* JADX INFO: renamed from: com.google.firebase.messaging.P$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private final String f18824a;

        /* JADX INFO: renamed from: b */
        private final String f18825b;

        /* JADX INFO: renamed from: c */
        private final String[] f18826c;

        /* JADX INFO: renamed from: d */
        private final String f18827d;

        /* JADX INFO: renamed from: e */
        private final String f18828e;

        /* JADX INFO: renamed from: f */
        private final String[] f18829f;

        /* JADX INFO: renamed from: g */
        private final String f18830g;

        /* JADX INFO: renamed from: h */
        private final String f18831h;

        /* JADX INFO: renamed from: i */
        private final String f18832i;

        /* JADX INFO: renamed from: j */
        private final String f18833j;

        /* JADX INFO: renamed from: k */
        private final String f18834k;

        /* JADX INFO: renamed from: l */
        private final String f18835l;

        /* JADX INFO: renamed from: m */
        private final String f18836m;

        /* JADX INFO: renamed from: n */
        private final Uri f18837n;

        /* JADX INFO: renamed from: o */
        private final String f18838o;

        /* JADX INFO: renamed from: p */
        private final Integer f18839p;

        /* JADX INFO: renamed from: q */
        private final Integer f18840q;

        /* JADX INFO: renamed from: r */
        private final Integer f18841r;

        /* JADX INFO: renamed from: s */
        private final int[] f18842s;

        /* JADX INFO: renamed from: t */
        private final Long f18843t;

        /* JADX INFO: renamed from: u */
        private final boolean f18844u;

        /* JADX INFO: renamed from: v */
        private final boolean f18845v;

        /* JADX INFO: renamed from: w */
        private final boolean f18846w;

        /* JADX INFO: renamed from: x */
        private final boolean f18847x;

        /* JADX INFO: renamed from: y */
        private final boolean f18848y;

        /* JADX INFO: renamed from: z */
        private final long[] f18849z;

        /* JADX INFO: renamed from: b */
        private static String[] m22393b(C4958H c4958h, String str) {
            Object[] objArrM22361g = c4958h.m22361g(str);
            if (objArrM22361g == null) {
                return null;
            }
            String[] strArr = new String[objArrM22361g.length];
            for (int i7 = 0; i7 < objArrM22361g.length; i7++) {
                strArr[i7] = String.valueOf(objArrM22361g[i7]);
            }
            return strArr;
        }

        /* JADX INFO: renamed from: a */
        public String m22394a() {
            return this.f18827d;
        }

        /* JADX INFO: renamed from: c */
        public String m22395c() {
            return this.f18824a;
        }

        private b(C4958H c4958h) {
            this.f18824a = c4958h.m22370p("gcm.n.title");
            this.f18825b = c4958h.m22362h("gcm.n.title");
            this.f18826c = m22393b(c4958h, "gcm.n.title");
            this.f18827d = c4958h.m22370p("gcm.n.body");
            this.f18828e = c4958h.m22362h("gcm.n.body");
            this.f18829f = m22393b(c4958h, "gcm.n.body");
            this.f18830g = c4958h.m22370p("gcm.n.icon");
            this.f18832i = c4958h.m22369o();
            this.f18833j = c4958h.m22370p("gcm.n.tag");
            this.f18834k = c4958h.m22370p("gcm.n.color");
            this.f18835l = c4958h.m22370p("gcm.n.click_action");
            this.f18836m = c4958h.m22370p("gcm.n.android_channel_id");
            this.f18837n = c4958h.m22360f();
            this.f18831h = c4958h.m22370p("gcm.n.image");
            this.f18838o = c4958h.m22370p("gcm.n.ticker");
            this.f18839p = c4958h.m22357b("gcm.n.notification_priority");
            this.f18840q = c4958h.m22357b("gcm.n.visibility");
            this.f18841r = c4958h.m22357b("gcm.n.notification_count");
            this.f18844u = c4958h.m22356a("gcm.n.sticky");
            this.f18845v = c4958h.m22356a("gcm.n.local_only");
            this.f18846w = c4958h.m22356a("gcm.n.default_sound");
            this.f18847x = c4958h.m22356a("gcm.n.default_vibrate_timings");
            this.f18848y = c4958h.m22356a("gcm.n.default_light_settings");
            this.f18843t = c4958h.m22364j("gcm.n.event_time");
            this.f18842s = c4958h.m22359e();
            this.f18849z = c4958h.m22371q();
        }
    }

    public C4966P(Bundle bundle) {
        this.f18821a = bundle;
    }

    /* JADX INFO: renamed from: T */
    public Map m22391T() {
        if (this.f18822b == null) {
            this.f18822b = AbstractC4982d.a.m22470a(this.f18821a);
        }
        return this.f18822b;
    }

    /* JADX INFO: renamed from: U */
    public b m22392U() {
        if (this.f18823c == null && C4958H.m22351t(this.f18821a)) {
            this.f18823c = new b(new C4958H(this.f18821a));
        }
        return this.f18823c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        C4967Q.m22396c(this, parcel, i7);
    }
}
