package com.anas_mugally.clipboard.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Log;
import com.anas_mugally.clipboard.MyApplication;
import com.anas_mugally.clipboard.R;
import com.google.firebase.messaging.C4966P;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.Map;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import org.json.JSONObject;
import p017C.AbstractC0111l;
import p017C.C0114o;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p302m6.AbstractC6406h;
import p318o6.AbstractC6615I0;
import p318o6.AbstractC6626O;
import p318o6.AbstractC6672k;
import p318o6.C6656c0;
import p318o6.InterfaceC6624N;

/* JADX INFO: loaded from: classes.dex */
public final class MyFirebaseMessagingService extends FirebaseMessagingService {

    /* JADX INFO: renamed from: s */
    public static final C3076a f12688s = new C3076a(null);

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.service.MyFirebaseMessagingService$a */
    public static final class C3076a {
        public /* synthetic */ C3076a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m15269a() {
            FirebaseMessaging.m22306n().m22315B("all");
        }

        private C3076a() {
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.service.MyFirebaseMessagingService$b */
    static final class C3077b extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12689a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f12691c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ AbstractC0111l.e f12692d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f12693e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ String f12694f;

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.service.MyFirebaseMessagingService$b$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f12695a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Bitmap f12696b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ AbstractC0111l.e f12697c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ String f12698d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ String f12699e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ MyFirebaseMessagingService f12700f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Bitmap bitmap, AbstractC0111l.e eVar, String str, String str2, MyFirebaseMessagingService myFirebaseMessagingService, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f12696b = bitmap;
                this.f12697c = eVar;
                this.f12698d = str;
                this.f12699e = str2;
                this.f12700f = myFirebaseMessagingService;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f12696b, this.f12697c, this.f12698d, this.f12699e, this.f12700f, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f12695a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                if (this.f12696b != null) {
                    this.f12697c.m484y(new AbstractC0111l.b().m447i(this.f12696b).m448j(this.f12698d).m449k(this.f12699e));
                    this.f12697c.m475p(this.f12696b);
                }
                MyFirebaseMessagingService myFirebaseMessagingService = this.f12700f;
                Notification notificationM463b = this.f12697c.m463b();
                AbstractC6118n.m27186d(notificationM463b, "build(...)");
                myFirebaseMessagingService.m15258F(notificationM463b);
                return C1444v.f4971a;
            }
        }

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.service.MyFirebaseMessagingService$b$b */
        static final class b extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f12701a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ MyFirebaseMessagingService f12702b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ AbstractC0111l.e f12703c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(MyFirebaseMessagingService myFirebaseMessagingService, AbstractC0111l.e eVar, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f12702b = myFirebaseMessagingService;
                this.f12703c = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new b(this.f12702b, this.f12703c, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f12701a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                MyFirebaseMessagingService myFirebaseMessagingService = this.f12702b;
                Notification notificationM463b = this.f12703c.m463b();
                AbstractC6118n.m27186d(notificationM463b, "build(...)");
                myFirebaseMessagingService.m15258F(notificationM463b);
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3077b(String str, AbstractC0111l.e eVar, String str2, String str3, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f12691c = str;
            this.f12692d = eVar;
            this.f12693e = str2;
            this.f12694f = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return MyFirebaseMessagingService.this.new C3077b(this.f12691c, this.f12692d, this.f12693e, this.f12694f, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((C3077b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        
            if (p318o6.AbstractC6668i.m28186g(r12, r4, r11) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
        
            if (p318o6.AbstractC6668i.m28186g(r12, r1, r11) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f12689a;
            try {
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1437o.m6082b(obj);
                    } else {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1437o.m6082b(obj);
                    }
                    return C1444v.f4971a;
                }
                AbstractC1437o.m6082b(obj);
                Bitmap bitmapM15255C = MyFirebaseMessagingService.this.m15255C(this.f12691c);
                AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
                a aVar = new a(bitmapM15255C, this.f12692d, this.f12693e, this.f12694f, MyFirebaseMessagingService.this, null);
                this.f12689a = 1;
            } catch (Exception unused) {
                AbstractC6615I0 abstractC6615I0M28164c2 = C6656c0.m28164c();
                b bVar = new b(MyFirebaseMessagingService.this, this.f12692d, null);
                this.f12689a = 2;
            }
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: A */
    private final Intent m15254A() {
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getApplicationContext().getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(335544320);
            return launchIntentForPackage;
        }
        Intent intent = new Intent();
        intent.addFlags(268435456);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final Bitmap m15255C(String str) {
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            AbstractC6118n.m27185c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDoInput(true);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.connect();
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(httpURLConnection.getInputStream());
            httpURLConnection.disconnect();
            return bitmapDecodeStream;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: D */
    private final void m15256D(AbstractC0111l.e eVar, String str, String str2, String str3) {
        AbstractC6672k.m28227d(AbstractC6626O.m28098a(C6656c0.m28163b()), null, null, new C3077b(str, eVar, str2, str3, null), 3, null);
    }

    /* JADX INFO: renamed from: E */
    private final void m15257E(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final void m15258F(Notification notification) {
        try {
            C0114o.m540b(this).m545d(1001, notification);
        } catch (SecurityException e7) {
            Log.e("FCMService", "Permission denied for notification ", e7);
        } catch (Exception e8) {
            Log.e("FCMService", "Error showing notification ", e8);
        }
    }

    /* JADX INFO: renamed from: G */
    private final void m15259G(String str, String str2, String str3, String str4, String str5) {
        AbstractC0111l.e eVarM468h = new AbstractC0111l.e(this, "fcm_notifications").m482w(R.mipmap.ic_launcher).m470j(str).m469i(str2).m484y(new AbstractC0111l.c().m455h(str2)).m480u(1).m473m(-1).m465e(true).m468h(PendingIntent.getActivity(this, 0, m15263x(str4, str5), 201326592));
        AbstractC6118n.m27186d(eVarM468h, "setContentIntent(...)");
        if (str3 != null && str3.length() != 0) {
            m15256D(eVarM468h, str3, str, str2);
            return;
        }
        Notification notificationM463b = eVarM468h.m463b();
        AbstractC6118n.m27186d(notificationM463b, "build(...)");
        m15258F(notificationM463b);
    }

    /* JADX INFO: renamed from: w */
    private final void m15262w() {
        String string = getString(R.string.notification_channel_name);
        AbstractC6118n.m27186d(string, "getString(...)");
        String string2 = getString(R.string.notification_channel_description);
        AbstractC6118n.m27186d(string2, "getString(...)");
        NotificationChannel notificationChannel = new NotificationChannel("fcm_notifications", string, 3);
        notificationChannel.setDescription(string2);
        notificationChannel.enableLights(true);
        notificationChannel.enableVibration(true);
        notificationChannel.setShowBadge(true);
        Object systemService = getSystemService("notification");
        AbstractC6118n.m27185c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
    }

    /* JADX INFO: renamed from: x */
    private final Intent m15263x(String str, String str2) {
        if (str != null && str.length() != 0) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.addFlags(268435456);
                return intent;
            } catch (Exception unused) {
                return m15254A();
            }
        }
        if (str2 == null || str2.length() == 0) {
            return m15254A();
        }
        Intent intentM15264y = m15264y(str2);
        return intentM15264y == null ? m15254A() : intentM15264y;
    }

    /* JADX INFO: renamed from: y */
    private final Intent m15264y(String str) {
        try {
            ActivityInfo[] activityInfoArr = getApplicationContext().getPackageManager().getPackageInfo(getApplicationContext().getPackageName(), 1).activities;
            if (activityInfoArr != null) {
                for (ActivityInfo activityInfo : activityInfoArr) {
                    String str2 = activityInfo.name;
                    AbstractC6118n.m27184b(str2);
                    if (AbstractC6406h.m27564w(AbstractC6406h.m27588P0(str2, '.', null, 2, null), str, true)) {
                        Intent intent = new Intent(this, Class.forName(str2));
                        intent.addFlags(335544320);
                        return intent;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    private final String m15265z(String str) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String language = Locale.getDefault().getLanguage();
            if (jSONObject.has(language)) {
                string = jSONObject.getString(language);
            } else {
                string = jSONObject.has("en") ? jSONObject.getString("en") : jSONObject.getString(jSONObject.keys().next());
            }
            AbstractC6118n.m27184b(string);
            return string;
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: B */
    public final boolean m15266B() {
        return !MyApplication.f12496a.m15107c(getApplication());
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m15262w();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* JADX INFO: renamed from: p */
    public void mo15267p(C4966P remoteMessage) {
        String strM22395c;
        String strM22394a;
        String str;
        boolean zM15266B;
        AbstractC6118n.m27187e(remoteMessage, "remoteMessage");
        super.mo15267p(remoteMessage);
        Map mapM22391T = remoteMessage.m22391T();
        AbstractC6118n.m27186d(mapM22391T, "getData(...)");
        if (mapM22391T.isEmpty()) {
            C4966P.b bVarM22392U = remoteMessage.m22392U();
            if (bVarM22392U == null || (strM22395c = bVarM22392U.m22395c()) == null || (strM22394a = bVarM22392U.m22394a()) == null) {
                return;
            }
            m15259G(strM22395c, strM22394a, null, null, null);
            return;
        }
        String str2 = (String) mapM22391T.get("title");
        if (str2 == null || (str = (String) mapM22391T.get("body")) == null) {
            return;
        }
        String str3 = (String) mapM22391T.get("image");
        String str4 = (String) mapM22391T.get("url");
        String str5 = (String) mapM22391T.get("className");
        String str6 = (String) mapM22391T.get("audience");
        if (AbstractC6118n.m27183a(str6, "premium")) {
            zM15266B = m15266B();
        } else {
            zM15266B = (AbstractC6118n.m27183a(str6, "free") && m15266B()) ? false : true;
        }
        if (zM15266B) {
            m15259G(m15265z(str2), m15265z(str), str3, str4, str5);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* JADX INFO: renamed from: r */
    public void mo15268r(String token) {
        AbstractC6118n.m27187e(token, "token");
        super.mo15268r(token);
        m15257E(token);
    }
}
