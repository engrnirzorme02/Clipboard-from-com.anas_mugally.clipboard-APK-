package p241f1;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.DialogInterfaceC2241b;
import com.anas_mugally.clipboard.MyApplication;
import com.anas_mugally.clipboard.R;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p233e1.AbstractC5286b0;
import p405z3.C7611b;

/* JADX INFO: renamed from: f1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5406d {

    /* JADX INFO: renamed from: d */
    public static final a f20583d = new a(null);

    /* JADX INFO: renamed from: a */
    private final Context f20584a;

    /* JADX INFO: renamed from: b */
    private AbstractC5286b0 f20585b;

    /* JADX INFO: renamed from: c */
    private b f20586c;

    /* JADX INFO: renamed from: f1.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: f1.d$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo24512a(View view);
    }

    public C5406d(Context context) {
        AbstractC6118n.m27187e(context, "context");
        this.f20584a = context;
    }

    /* JADX INFO: renamed from: d */
    private final SharedPreferences m24505d() {
        SharedPreferences sharedPreferences = this.f20584a.getSharedPreferences("SHARED_NAME", 0);
        AbstractC6118n.m27186d(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    /* JADX INFO: renamed from: e */
    private final SharedPreferences.Editor m24506e() {
        return m24505d().edit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m24507h(C5406d c5406d, View view) {
        MyApplication.C3043a c3043a = MyApplication.f12496a;
        c3043a.m15108d(c5406d.f20584a, c3043a.m15106b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m24508i(DialogInterfaceC2241b dialogInterfaceC2241b, View view) {
        dialogInterfaceC2241b.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m24509j(AbstractC5286b0 abstractC5286b0, C5406d c5406d, DialogInterfaceC2241b dialogInterfaceC2241b, View view) {
        SharedPreferences.Editor editorPutBoolean;
        if (!abstractC5286b0.f20168v.isChecked()) {
            Toast.makeText(c5406d.f20584a, R.string.please_accespt_to_contenue, 0).show();
            return;
        }
        SharedPreferences.Editor editorM24506e = c5406d.m24506e();
        if (editorM24506e != null && (editorPutBoolean = editorM24506e.putBoolean("isAcceptAccessibilityPolicy", true)) != null) {
            editorPutBoolean.apply();
        }
        b bVar = c5406d.f20586c;
        if (bVar != null) {
            AbstractC6118n.m27184b(view);
            bVar.mo24512a(view);
        }
        dialogInterfaceC2241b.dismiss();
    }

    /* JADX INFO: renamed from: f */
    public final C5406d m24510f(b listener) {
        AbstractC6118n.m27187e(listener, "listener");
        this.f20586c = listener;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final void m24511g() {
        this.f20585b = AbstractC5286b0.m24299u(LayoutInflater.from(this.f20584a));
        C7611b c7611bMo9116t = new C7611b(this.f20584a).mo9116t("AccessibilityService API");
        AbstractC5286b0 abstractC5286b0 = this.f20585b;
        final DialogInterfaceC2241b dialogInterfaceC2241bMo9097a = c7611bMo9116t.mo9117u(abstractC5286b0 != null ? abstractC5286b0.m10849k() : null).mo9100d(true).mo9097a();
        AbstractC6118n.m27186d(dialogInterfaceC2241bMo9097a, "create(...)");
        final AbstractC5286b0 abstractC5286b1 = this.f20585b;
        if (abstractC5286b1 != null) {
            abstractC5286b1.f20171y.setOnClickListener(new View.OnClickListener() { // from class: f1.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C5406d.m24507h(this.f20578a, view);
                }
            });
            abstractC5286b1.f20169w.setOnClickListener(new View.OnClickListener() { // from class: f1.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C5406d.m24508i(dialogInterfaceC2241bMo9097a, view);
                }
            });
            abstractC5286b1.f20170x.setOnClickListener(new View.OnClickListener() { // from class: f1.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C5406d.m24509j(abstractC5286b1, this, dialogInterfaceC2241bMo9097a, view);
                }
            });
        }
        dialogInterfaceC2241bMo9097a.show();
    }
}
