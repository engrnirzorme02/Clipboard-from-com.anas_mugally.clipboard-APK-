package com.anas_mugally.clipboard;

import android.app.Application;
import com.anas_mugally.clipboard.service.MyAccessibilityService;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: com.anas_mugally.clipboard.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3081u {
    /* JADX INFO: renamed from: a */
    public static final boolean m15314a(Application application) {
        AbstractC6118n.m27187e(application, "<this>");
        return MyAccessibilityService.f12639O.m15247c(application, MyAccessibilityService.class) == MyAccessibilityService.EnumC3070a.RUNNING;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m15315b(Application application) {
        AbstractC6118n.m27187e(application, "<this>");
        return m15314a(application) && application.getSharedPreferences("SHARED_NAME", 0).getBoolean(C3034A.f12453a.m15031e(), true);
    }
}
