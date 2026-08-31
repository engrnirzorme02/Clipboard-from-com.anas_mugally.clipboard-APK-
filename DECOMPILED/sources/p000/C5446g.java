package p000;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AbstractActivityC2242c;
import androidx.core.content.FileProvider;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.ActionsLayout;
import com.anas_mugally.clipboard.R;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1434l;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p220c6.AbstractC3026b;
import p238e6.InterfaceC5371p;
import p318o6.AbstractC6626O;
import p318o6.AbstractC6634S0;
import p318o6.AbstractC6672k;
import p318o6.C6656c0;
import p318o6.InterfaceC6624N;

/* JADX INFO: renamed from: g */
/* JADX INFO: loaded from: classes2.dex */
public final class C5446g {

    /* JADX INFO: renamed from: a */
    public static final C5446g f20735a = new C5446g();

    /* JADX INFO: renamed from: g$a */
    public static abstract class a {

        /* JADX INFO: renamed from: g$a$a, reason: collision with other inner class name */
        public static final class C7688a extends a {

            /* JADX INFO: renamed from: a */
            public static final C7688a f20736a = new C7688a();

            private C7688a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: g$a$b */
        public static final class b extends a {

            /* JADX INFO: renamed from: a */
            public static final b f20737a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: g$b */
    static final class b extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f20738a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f20739b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f20739b = context;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return new b(this.f20739b, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            File[] fileArrListFiles;
            AbstractC2005b.m8369e();
            if (this.f20738a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            try {
                File file = new File(this.f20739b.getCacheDir(), "shared_texts");
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                    for (File file2 : fileArrListFiles) {
                        if (System.currentTimeMillis() - file2.lastModified() > 3600000) {
                            file2.delete();
                        }
                    }
                }
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            return C1444v.f4971a;
        }
    }

    private C5446g() {
    }

    /* JADX INFO: renamed from: c */
    private final void m24646c(Context context, String str, ComponentName componentName, ActionsLayout.EnumC3037c enumC3037c, int i7) {
        try {
            File file = new File(context.getCacheDir(), "shared_texts");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, "clipz app " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(System.currentTimeMillis())) + ".txt");
            FileWriter fileWriter = new FileWriter(file2);
            try {
                fileWriter.write(str);
                C1444v c1444v = C1444v.f4971a;
                AbstractC3026b.m14999a(fileWriter, null);
                Uri uriM10569h = FileProvider.m10569h(context, context.getPackageName() + ".fileprovider", file2);
                AbstractC6118n.m27186d(uriM10569h, "getUriForFile(...)");
                Intent intent = new Intent("android.intent.action.SEND");
                if (componentName != null) {
                    intent.setComponent(componentName);
                }
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.STREAM", uriM10569h);
                intent.putExtra("android.intent.extra.SUBJECT", context.getString(R.string.processed_text));
                if (i7 != -1) {
                    intent.addFlags(i7);
                }
                intent.addFlags(1);
                intent.addFlags(268435456);
                if (enumC3037c == ActionsLayout.EnumC3037c.SPLIT) {
                    intent.addFlags(268439552);
                    intent.addFlags(134217728);
                }
                if (enumC3037c == ActionsLayout.EnumC3037c.SHARE) {
                    context.startActivity(intent);
                    return;
                }
                Bundle bundle = ActivityOptions.makeBasic().toBundle();
                bundle.putInt("android.activity.windowingMode", enumC3037c == ActionsLayout.EnumC3037c.POPUP ? 5 : 3);
                context.startActivity(intent, bundle);
                if (context instanceof AbstractActivityC2242c) {
                    ((AbstractActivityC2242c) context).overridePendingTransition(0, 0);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3026b.m14999a(fileWriter, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            Toast.makeText(context, context.getString(R.string.error_sharing_text), 1).show();
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m24647d(Context context, String str, ComponentName componentName, ActionsLayout.EnumC3037c enumC3037c, int i7) {
        Intent intent = new Intent("android.intent.action.SEND");
        if (componentName != null) {
            intent.setComponent(componentName);
        }
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        if (i7 != -1) {
            intent.addFlags(i7);
        }
        intent.addFlags(268435456);
        if (enumC3037c == ActionsLayout.EnumC3037c.SPLIT) {
            intent.addFlags(268439552);
            intent.addFlags(134217728);
        }
        if (enumC3037c == ActionsLayout.EnumC3037c.SHARE) {
            context.startActivity(intent);
            return;
        }
        Bundle bundle = ActivityOptions.makeBasic().toBundle();
        bundle.putInt("android.activity.windowingMode", enumC3037c == ActionsLayout.EnumC3037c.POPUP ? 5 : 3);
        C1444v c1444v = C1444v.f4971a;
        context.startActivity(intent, bundle);
        if (context instanceof AbstractActivityC2242c) {
            ((AbstractActivityC2242c) context).overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m24648f(C5446g c5446g, Context context, String str, ComponentName componentName, ActionsLayout.EnumC3037c enumC3037c, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            componentName = null;
        }
        ComponentName componentName2 = componentName;
        if ((i8 & 4) != 0) {
            enumC3037c = ActionsLayout.EnumC3037c.SHARE;
        }
        ActionsLayout.EnumC3037c enumC3037c2 = enumC3037c;
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        c5446g.m24651e(context, str, componentName2, enumC3037c2, i7);
    }

    /* JADX INFO: renamed from: a */
    public final a m24649a(String text) {
        AbstractC6118n.m27187e(text, "text");
        return AbstractC3041D.m15088m(text) ? a.C7688a.f20736a : a.b.f20737a;
    }

    /* JADX INFO: renamed from: b */
    public final void m24650b(Context context) {
        AbstractC6118n.m27187e(context, "<this>");
        AbstractC6672k.m28227d(AbstractC6626O.m28098a(C6656c0.m28163b().plus(AbstractC6634S0.m28112b(null, 1, null))), null, null, new b(context, null), 3, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m24651e(Context context, String text, ComponentName componentName, ActionsLayout.EnumC3037c type, int i7) {
        AbstractC6118n.m27187e(context, "<this>");
        AbstractC6118n.m27187e(text, "text");
        AbstractC6118n.m27187e(type, "type");
        try {
            a aVarM24649a = m24649a(text);
            if (aVarM24649a instanceof a.C7688a) {
                m24647d(context, text, componentName, type, i7);
            } else {
                if (!(aVarM24649a instanceof a.b)) {
                    throw new C1434l();
                }
                m24646c(context, text, componentName, type, i7);
            }
        } catch (Exception unused) {
            Toast.makeText(context, context.getString(R.string.error_sharing_text), 1).show();
        }
    }
}
