package com.anas_mugally.clipboard;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.RemoteViews;
import com.anas_mugally.clipboard.broadcastReceiver.ScannerReceiver;
import com.anas_mugally.clipboard.p221ui.SettingActivity;
import com.anas_mugally.clipboard.p221ui.accessibilitySetting.AccessibilitySettingActivity;
import com.anas_mugally.clipboard.p221ui.addText.AddNoteActivity;
import com.anas_mugally.clipboard.p221ui.notes.BrowseNotesDialogActivity;
import com.anas_mugally.clipboard.p221ui.p222ai.AiTextProcessingActivity;
import com.anas_mugally.clipboard.p221ui.temporaryNotes.BrowserTemporaryTextActivity;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p017C.AbstractC0111l;
import p096L6.AbstractC0855a;
import p145S5.AbstractC1430h;
import p145S5.InterfaceC1429g;
import p238e6.InterfaceC5356a;

/* JADX INFO: renamed from: com.anas_mugally.clipboard.w */
/* JADX INFO: loaded from: classes.dex */
public final class C3149w {

    /* JADX INFO: renamed from: f */
    public static final a f13206f = new a(null);

    /* JADX INFO: renamed from: g */
    private static String f13207g = "fromNotification";

    /* JADX INFO: renamed from: h */
    private static final int f13208h = 0;

    /* JADX INFO: renamed from: i */
    private static C3149w f13209i;

    /* JADX INFO: renamed from: a */
    private final Context f13210a;

    /* JADX INFO: renamed from: b */
    private String f13211b;

    /* JADX INFO: renamed from: c */
    private String f13212c;

    /* JADX INFO: renamed from: d */
    private String f13213d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1429g f13214e;

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.w$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m16727a() {
            return C3149w.f13207g;
        }

        /* JADX INFO: renamed from: b */
        public final C3149w m16728b(Context context) {
            AbstractC6118n.m27187e(context, "context");
            C3149w c3149w = C3149w.f13209i;
            if (c3149w != null) {
                return c3149w;
            }
            C3149w c3149w2 = new C3149w(context, null);
            C3149w.f13209i = c3149w2;
            return c3149w2;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m16729c(Context context) {
            AbstractC6118n.m27187e(context, "context");
            if (Build.VERSION.SDK_INT >= 33) {
                return AbstractC0855a.m3967a(context, "android.permission.POST_NOTIFICATIONS");
            }
            return true;
        }

        private a() {
        }
    }

    public /* synthetic */ C3149w(Context context, AbstractC6112h abstractC6112h) {
        this(context);
    }

    /* JADX INFO: renamed from: f */
    private final Notification m16717f() {
        RemoteViews remoteViews = new RemoteViews(this.f13210a.getPackageName(), R.layout.notification_custom_layout);
        m16722m(remoteViews);
        AbstractC0111l.e eVar = new AbstractC0111l.e(this.f13210a, this.f13212c);
        eVar.m482w(R.drawable.ic_clipboard);
        eVar.m472l(remoteViews);
        eVar.m471k(remoteViews);
        eVar.m484y(new AbstractC0111l.f());
        eVar.m480u(-1);
        eVar.m479t(true);
        eVar.m465e(true);
        eVar.m473m(0);
        eVar.m459A(new long[]{0});
        Notification notificationM463b = eVar.m463b();
        AbstractC6118n.m27186d(notificationM463b, "build(...)");
        notificationM463b.flags |= 2;
        return notificationM463b;
    }

    /* JADX INFO: renamed from: h */
    private final PendingIntent m16718h(Class cls, int i7) {
        Intent intent = new Intent(this.f13210a, (Class<?>) cls);
        intent.addFlags(i7);
        PendingIntent activity = PendingIntent.getActivity(this.f13210a, cls.hashCode(), intent, 201326592);
        AbstractC6118n.m27186d(activity, "getActivity(...)");
        return activity;
    }

    /* JADX INFO: renamed from: i */
    static /* synthetic */ PendingIntent m16719i(C3149w c3149w, Class cls, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 268468224;
        }
        return c3149w.m16718h(cls, i7);
    }

    /* JADX INFO: renamed from: j */
    private final PendingIntent m16720j(int i7) {
        String str;
        Intent intent = new Intent(this.f13210a, (Class<?>) new Class[]{ScannerReceiver.class, ScannerReceiver.class}[i7]);
        if (i7 != 0) {
            str = i7 != 1 ? null : "com.anas_mugally.clipboard.action_extract_text_while_scrolling";
        } else {
            str = "com.anas_mugally.clipboard.action_extract_text";
        }
        intent.setAction(str);
        intent.putExtra(f13207g, true);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f13210a, 0, intent, 201326592);
        AbstractC6118n.m27186d(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final NotificationManager m16721k(C3149w c3149w) {
        Object systemService = c3149w.f13210a.getSystemService("notification");
        AbstractC6118n.m27185c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return (NotificationManager) systemService;
    }

    /* JADX INFO: renamed from: m */
    private final void m16722m(RemoteViews remoteViews) {
        remoteViews.setOnClickPendingIntent(R.id.btn_add, m16719i(this, AddNoteActivity.class, 0, 2, null));
        remoteViews.setOnClickPendingIntent(R.id.btn_show_texts, m16719i(this, BrowseNotesDialogActivity.class, 0, 2, null));
        remoteViews.setOnClickPendingIntent(R.id.btn_show_temporary, m16719i(this, BrowserTemporaryTextActivity.class, 0, 2, null));
        remoteViews.setOnClickPendingIntent(R.id.btn_ai_feature, m16719i(this, AiTextProcessingActivity.class, 0, 2, null));
        MyApplication.C3043a c3043a = MyApplication.f12496a;
        MyApplication myApplicationM15105a = c3043a.m15105a();
        AbstractC6118n.m27184b(myApplicationM15105a);
        remoteViews.setOnClickPendingIntent(R.id.btn_extract_text, AbstractC3081u.m15315b(myApplicationM15105a) ? m16720j(0) : m16718h(AccessibilitySettingActivity.class, 872415232));
        MyApplication myApplicationM15105a2 = c3043a.m15105a();
        AbstractC6118n.m27184b(myApplicationM15105a2);
        remoteViews.setOnClickPendingIntent(R.id.btn_scroll_extract_text, AbstractC3081u.m15315b(myApplicationM15105a2) ? m16720j(1) : m16718h(AccessibilitySettingActivity.class, 872415232));
        remoteViews.setOnClickPendingIntent(R.id.btn_setting, m16718h(SettingActivity.class, 872415232));
        remoteViews.setOnClickPendingIntent(R.id.btn_pro_setting, m16718h(AccessibilitySettingActivity.class, 872415232));
    }

    /* JADX INFO: renamed from: n */
    private final void m16723n() {
        NotificationChannel notificationChannel = new NotificationChannel(this.f13212c, this.f13211b, 2);
        notificationChannel.setDescription(this.f13213d);
        m16725g().createNotificationChannel(notificationChannel);
    }

    /* JADX INFO: renamed from: e */
    public final void m16724e() {
        m16725g().cancel(f13208h);
    }

    /* JADX INFO: renamed from: g */
    public final NotificationManager m16725g() {
        return (NotificationManager) this.f13214e.getValue();
    }

    /* JADX INFO: renamed from: l */
    public final void m16726l() {
        m16723n();
        m16725g().notify(f13208h, m16717f());
    }

    private C3149w(Context context) {
        this.f13210a = context;
        String string = context.getString(R.string.helper_notification_name);
        AbstractC6118n.m27186d(string, "getString(...)");
        this.f13211b = string;
        this.f13212c = "control";
        String string2 = context.getString(R.string.heper_notfication_description);
        AbstractC6118n.m27186d(string2, "getString(...)");
        this.f13213d = string2;
        this.f13214e = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: com.anas_mugally.clipboard.v
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C3149w.m16721k(this.f13205a);
            }
        });
    }
}
