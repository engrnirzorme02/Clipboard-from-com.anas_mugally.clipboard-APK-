package p281k1;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AbstractActivityC2242c;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.AbstractC3081u;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.MyApplication;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.database.AppDatabase;
import com.anas_mugally.clipboard.p221ui.TextDialogActivity;
import com.anas_mugally.clipboard.p221ui.accessibilitySetting.AccessibilitySettingFullActivity;
import com.anas_mugally.clipboard.p221ui.addText.AddNoteActivity;
import com.anas_mugally.clipboard.service.MyAccessibilityService;
import kotlin.jvm.internal.AbstractC6118n;
import p000.C5446g;
import p371v1.C7213n;
import p405z3.C7611b;

/* JADX INFO: renamed from: k1.K */
/* JADX INFO: loaded from: classes.dex */
public final class C5920K {

    /* JADX INFO: renamed from: a */
    private final Context f23503a;

    /* JADX INFO: renamed from: b */
    private final String f23504b;

    /* JADX INFO: renamed from: c */
    private final boolean f23505c;

    /* JADX INFO: renamed from: d */
    private View f23506d;

    /* JADX INFO: renamed from: e */
    private AppDatabase f23507e;

    /* JADX INFO: renamed from: f */
    private final MyAccessibilityService f23508f;

    /* JADX INFO: renamed from: k1.K$a */
    public static final class a implements C7213n.a {
        a() {
        }

        @Override // p371v1.C7213n.a
        /* JADX INFO: renamed from: a */
        public void mo15502a(String error) {
            AbstractC6118n.m27187e(error, "error");
            Toast.makeText(C5920K.this.f23503a, error, 0).show();
        }

        @Override // p371v1.C7213n.a
        /* JADX INFO: renamed from: b */
        public void mo15503b(String categoryName) {
            AbstractC6118n.m27187e(categoryName, "categoryName");
            if (C5920K.this.f23503a instanceof AbstractActivityC2242c) {
                C3034A.f12453a.m15026O((AbstractActivityC2242c) C5920K.this.f23503a, R.id.save, C5920K.this.f23505c);
            }
            Toast.makeText(C5920K.this.f23503a, C5920K.this.f23503a.getString(R.string.done_add_to_clipboard, categoryName), 0).show();
        }
    }

    public C5920K(Context context, String text, boolean z7) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(text, "text");
        this.f23503a = context;
        this.f23504b = text;
        this.f23505c = z7;
        this.f23508f = MyAccessibilityService.f12639O.m15245a();
    }

    /* JADX INFO: renamed from: g */
    private final void m26705g() {
        C5446g.m24648f(C5446g.f20735a, this.f23503a, this.f23504b, new ComponentName(this.f23503a, (Class<?>) AddNoteActivity.class), null, 1082130432, 4, null);
    }

    /* JADX INFO: renamed from: h */
    private final void m26706h() {
        C3034A.f12453a.m15029c(this.f23503a, this.f23504b);
        Toast.makeText(this.f23503a, R.string.copied_succ, 0).show();
    }

    /* JADX INFO: renamed from: j */
    private final void m26707j() {
        C5446g.m24648f(C5446g.f20735a, this.f23503a, this.f23504b, new ComponentName(this.f23503a, (Class<?>) TextDialogActivity.class), null, 1082130432, 4, null);
    }

    /* JADX INFO: renamed from: k */
    private final void m26708k() {
        Context context = this.f23503a;
        AppDatabase appDatabase = this.f23507e;
        AbstractC6118n.m27184b(appDatabase);
        C7213n c7213n = new C7213n(context, appDatabase);
        View view = this.f23506d;
        AbstractC6118n.m27184b(view);
        String str = this.f23504b;
        AbstractC6118n.m27184b(str);
        c7213n.m31850m(view, str, new a());
    }

    /* JADX INFO: renamed from: l */
    private final void m26709l() {
        MyApplication myApplicationM15105a = MyApplication.f12496a.m15105a();
        AbstractC6118n.m27184b(myApplicationM15105a);
        if (!AbstractC3081u.m15315b(myApplicationM15105a)) {
            if (this.f23503a instanceof AbstractActivityC2242c) {
                new C7611b(this.f23503a).m33365P(R.string.send_text_to_external_title).m33354E(R.string.send_text_to_external_description).m33361L(R.string.activation, new DialogInterface.OnClickListener() { // from class: k1.G
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i7) {
                        C5920K.m26710m(this.f23500a, dialogInterface, i7);
                    }
                }).m33358I(R.string.cancel, new DialogInterface.OnClickListener() { // from class: k1.H
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i7) {
                        C5920K.m26711n(dialogInterface, i7);
                    }
                }).m33356G(R.string.preview_video, new DialogInterface.OnClickListener() { // from class: k1.I
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i7) {
                        C5920K.m26712o(this.f23501a, dialogInterface, i7);
                    }
                }).mo9100d(false).m9118v();
                return;
            } else {
                m26715r();
                return;
            }
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: k1.J
            @Override // java.lang.Runnable
            public final void run() {
                C5920K.m26713p(this.f23502a);
            }
        }, MyAccessibilityService.f12639O.m15246b());
        Context context = this.f23503a;
        if (context instanceof AbstractActivityC2242c) {
            ((AbstractActivityC2242c) context).finishAffinity();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m26710m(C5920K c5920k, DialogInterface dialogInterface, int i7) {
        c5920k.m26715r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m26711n(DialogInterface dialogInterface, int i7) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final void m26712o(C5920K c5920k, DialogInterface dialogInterface, int i7) {
        C3034A c3034a = C3034A.f12453a;
        Context context = c5920k.f23503a;
        MyApplication myApplicationM15105a = MyApplication.f12496a.m15105a();
        AbstractC6118n.m27184b(myApplicationM15105a);
        c3034a.m15019F(context, myApplicationM15105a.m15103e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m26713p(C5920K c5920k) {
        MyAccessibilityService myAccessibilityService = c5920k.f23508f;
        AbstractC6118n.m27184b(myAccessibilityService);
        if (MyAccessibilityService.m15198K(myAccessibilityService, c5920k.f23504b, false, null, 4, null)) {
            return;
        }
        C3034A.f12453a.m15029c(c5920k.f23503a, c5920k.f23504b);
        Toast.makeText(c5920k.f23503a, R.string.copied_succ, 0).show();
    }

    /* JADX INFO: renamed from: q */
    private final void m26714q() {
        C3034A.f12453a.m15024L(this.f23503a, this.f23504b);
    }

    /* JADX INFO: renamed from: r */
    private final void m26715r() {
        this.f23503a.startActivity(new Intent(this.f23503a, (Class<?>) AccessibilitySettingFullActivity.class).addFlags(872415232));
    }

    /* JADX INFO: renamed from: i */
    public final void m26716i(int i7) {
        if (AbstractC3041D.m15081f(this.f23503a, this.f23504b)) {
            switch (i7) {
                case R.id.add_note /* 2131296338 */:
                    m26705g();
                    break;
                case R.id.copy /* 2131296497 */:
                    m26706h();
                    break;
                case R.id.more /* 2131296785 */:
                    return;
                case R.id.open_in_dialog /* 2131296845 */:
                    m26707j();
                    break;
                case R.id.save /* 2131296931 */:
                    m26708k();
                    break;
                case R.id.send_text /* 2131296964 */:
                    m26709l();
                    break;
                case R.id.translate /* 2131297123 */:
                    m26714q();
                    break;
            }
            if (i7 == R.id.send_text || i7 == R.id.save) {
                return;
            }
            Context context = this.f23503a;
            if (context instanceof AbstractActivityC2242c) {
                C3034A.f12453a.m15026O((AbstractActivityC2242c) context, i7, this.f23505c);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m26717s(View anchor, AppDatabase database) {
        AbstractC6118n.m27187e(anchor, "anchor");
        AbstractC6118n.m27187e(database, "database");
        this.f23506d = anchor;
        this.f23507e = database;
    }
}
