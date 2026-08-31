package com.anas_mugally.clipboard;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.service.notification.StatusBarNotification;
import android.widget.Toast;
import com.anas_mugally.clipboard.broadcastReceiver.ShowOrHidePrimaryBubbleReceiver;
import com.anas_mugally.clipboard.database.AppDatabase;
import com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a;
import com.anas_mugally.clipboard.p221ui.SettingActivity;
import com.anas_mugally.clipboard.service.MyFirebaseMessagingService;
import java.util.ArrayList;
import java.util.Set;
import kotlin.coroutines.jvm.internal.AbstractC6087b;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p000.C5446g;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p152T5.AbstractC1617O;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p225d1.C5209a;
import p225d1.C5211c;
import p238e6.InterfaceC5371p;
import p318o6.AbstractC6672k;
import p318o6.C6689s0;
import p318o6.InterfaceC6624N;

/* JADX INFO: loaded from: classes.dex */
public final class MyApplication extends Application {

    /* JADX INFO: renamed from: a */
    public static final C3043a f12496a = new C3043a(null);

    /* JADX INFO: renamed from: b */
    private static final String f12497b = "https://clipzboard.com/privacy-policy";

    /* JADX INFO: renamed from: c */
    private static MyApplication f12498c;

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.MyApplication$a */
    public static final class C3043a {
        public /* synthetic */ C3043a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final MyApplication m15105a() {
            return MyApplication.f12498c;
        }

        /* JADX INFO: renamed from: b */
        public final String m15106b() {
            return MyApplication.f12497b;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m15107c(Application application) {
            MyApplication myApplication = (MyApplication) application;
            if (myApplication != null) {
                return myApplication.m15100i();
            }
            return true;
        }

        /* JADX INFO: renamed from: d */
        public final void m15108d(Context context, String link) {
            AbstractC6118n.m27187e(context, "context");
            AbstractC6118n.m27187e(link, "link");
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(link)));
            } catch (Exception unused) {
                Toast.makeText(context, context.getString(R.string.error_open_app), 0);
            }
        }

        private C3043a() {
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.MyApplication$b */
    static final class C3044b extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12499a;

        C3044b(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return MyApplication.this.new C3044b(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((C3044b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f12499a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            AppDatabase appDatabaseM15148b = AppDatabase.f12597p.m15148b(MyApplication.this);
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strValueOf = String.valueOf(jCurrentTimeMillis);
            appDatabaseM15148b.mo15144E().mo14842b(new C5209a(strValueOf, appDatabaseM15148b.mo15144E().mo14845e().size(), false, null, false, MyApplication.this.getString(R.string.clipboard), 28, null));
            Set setF = AbstractC1617O.m6652f(AbstractC6087b.m27122c(R.string.intro_1_hello_title), AbstractC6087b.m27122c(R.string.intro_2_ai_title), AbstractC6087b.m27122c(R.string.intro_3_bubble_title), AbstractC6087b.m27122c(R.string.intro_4_text_temporary_title), AbstractC6087b.m27122c(R.string.intro_5_quick_access_title), AbstractC6087b.m27122c(R.string.intro_6_quick_share_and_past_title), AbstractC6087b.m27122c(R.string.intro_7_screen_scanner_title), AbstractC6087b.m27122c(R.string.intro_8_end_title));
            Integer[] numArr = {AbstractC6087b.m27122c(R.string.intro_1_hello_content), AbstractC6087b.m27122c(R.string.intro_2_ai_content), AbstractC6087b.m27122c(R.string.intro_3_bubble_content), AbstractC6087b.m27122c(R.string.intro_4_text_temporary_content), AbstractC6087b.m27122c(R.string.intro_5_quick_access_content), AbstractC6087b.m27122c(R.string.intro_6_quick_share_and_past_content), AbstractC6087b.m27122c(R.string.intro_7_screen_scanner_content), AbstractC6087b.m27122c(R.string.intro_8_end_content)};
            MyApplication myApplication = MyApplication.this;
            ArrayList arrayList = new ArrayList(AbstractC1638q.m6774s(setF, 10));
            int i7 = 0;
            for (Object obj2 : setF) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    AbstractC1638q.m6773r();
                }
                String string = myApplication.getString(((Number) obj2).intValue());
                String string2 = myApplication.getString(numArr[i7].intValue());
                AbstractC6118n.m27186d(string2, "getString(...)");
                ArrayList arrayList2 = arrayList;
                String str = strValueOf;
                strValueOf = str;
                arrayList2.add(new C5211c(0, jCurrentTimeMillis - ((long) i7), string, string2, str, 0L, false, 97, null));
                arrayList = arrayList2;
                i7 = i8;
                myApplication = myApplication;
            }
            appDatabaseM15148b.mo15146G().mo14883x(arrayList);
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m15096d() {
        if (m15097f().getBoolean("first_open", true)) {
            AbstractC6672k.m28227d(C6689s0.f24991a, null, null, new C3044b(null), 3, null);
            SharedPreferences.Editor editorM15098g = m15098g();
            AbstractC6118n.m27184b(editorM15098g);
            editorM15098g.putBoolean("first_open", false).apply();
        }
    }

    /* JADX INFO: renamed from: f */
    private final SharedPreferences m15097f() {
        SharedPreferences sharedPreferences = getSharedPreferences("SHARED_NAME", 0);
        AbstractC6118n.m27186d(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    /* JADX INFO: renamed from: g */
    private final SharedPreferences.Editor m15098g() {
        return m15097f().edit();
    }

    /* JADX INFO: renamed from: h */
    private final boolean m15099h() {
        return m15097f().getBoolean(SettingActivity.f12802o0.m15617a(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final boolean m15100i() {
        SharedPreferences sharedPreferencesM15097f = m15097f();
        AbstractViewOnClickListenerC3111a.a aVar = AbstractViewOnClickListenerC3111a.f12891X;
        return sharedPreferencesM15097f.getBoolean(aVar.m15847a(), true) && m15097f().getBoolean(aVar.m15848b(), true) && m15097f().getBoolean(aVar.m15849c(), true) && m15097f().getBoolean(aVar.m15850d(), true) && m15097f().getBoolean(aVar.m15851e(), true);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m15101k(MyApplication myApplication, boolean z7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        myApplication.m15104j(z7);
    }

    /* JADX INFO: renamed from: l */
    private final void m15102l() {
        Intent intent = new Intent(this, (Class<?>) ShowOrHidePrimaryBubbleReceiver.class);
        intent.setAction("com.anas_mugally.clipboard.OPEN_APP_ACTION");
        sendBroadcast(intent);
    }

    /* JADX INFO: renamed from: e */
    public final String m15103e() {
        String string = m15097f().getString(C3034A.f12453a.m15047v(), "https://youtu.be/sOt7UH2T6fo");
        AbstractC6118n.m27184b(string);
        return string;
    }

    /* JADX INFO: renamed from: j */
    public final void m15104j(boolean z7) {
        if (m15099h()) {
            Object systemService = getSystemService("notification");
            AbstractC6118n.m27185c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            StatusBarNotification[] activeNotifications = ((NotificationManager) systemService).getActiveNotifications();
            AbstractC6118n.m27186d(activeNotifications, "getActiveNotifications(...)");
            if ((activeNotifications.length == 0) || z7) {
                C3149w.f13206f.m16728b(this).m16726l();
            }
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        f12498c = this;
        super.onCreate();
        C3069s.f12637a.m15187h(this);
        MyFirebaseMessagingService.f12688s.m15269a();
        m15096d();
        ShowOrHidePrimaryBubbleReceiver.f12594a.m15140b(this);
        m15102l();
        m15101k(this, false, 1, null);
        C5446g.f20735a.m24650b(this);
    }
}
