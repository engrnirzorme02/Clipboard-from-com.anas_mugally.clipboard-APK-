package com.anas_mugally.clipboard.p221ui;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.AbstractC2658t;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.ActionsLayout;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.database.AppDatabase;
import com.anas_mugally.clipboard.p221ui.TextDialogActivity;
import com.anas_mugally.clipboard.p221ui.addText.AddNoteActivity;
import com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a;
import com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity;
import com.anas_mugally.clipboard.p221ui.notes.AbstractViewOnClickListenerC3141a;
import com.anas_mugally.clipboard.p221ui.notes.BrowserNotesFullActivity;
import com.anas_mugally.clipboard.p221ui.p222ai.AiTextProcessingActivity;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Locale;
import java.util.Set;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1430h;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1617O;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p215c1.InterfaceC2983e;
import p220c6.AbstractC3026b;
import p223d.AbstractC5158A;
import p223d.AbstractC5166I;
import p225d1.C5211c;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p238e6.InterfaceC5372q;
import p241f1.C5400E;
import p281k1.C5920K;
import p297m1.C6327h;
import p302m6.AbstractC6406h;
import p318o6.AbstractC6615I0;
import p318o6.AbstractC6645Y;
import p318o6.AbstractC6668i;
import p318o6.AbstractC6672k;
import p318o6.C6656c0;
import p318o6.InterfaceC6624N;

/* JADX INFO: loaded from: classes.dex */
public final class TextDialogActivity extends BaseMyAppAdsActivity implements InterfaceC5372q {

    /* JADX INFO: renamed from: U0 */
    public static final C3101a f12819U0 = new C3101a(null);

    /* JADX INFO: renamed from: L0 */
    private final InterfaceC1429g f12820L0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: l1.h1
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return TextDialogActivity.m15660u4(this.f24027a);
        }
    });

    /* JADX INFO: renamed from: M0 */
    private C5211c f12821M0;

    /* JADX INFO: renamed from: N0 */
    private ActionsLayout f12822N0;

    /* JADX INFO: renamed from: O0 */
    private TextView f12823O0;

    /* JADX INFO: renamed from: P0 */
    private Toolbar f12824P0;

    /* JADX INFO: renamed from: Q0 */
    private ViewGroup f12825Q0;

    /* JADX INFO: renamed from: R0 */
    private TextToSpeech f12826R0;

    /* JADX INFO: renamed from: S0 */
    private boolean f12827S0;

    /* JADX INFO: renamed from: T0 */
    private MenuItem f12828T0;

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.TextDialogActivity$a */
    public static final class C3101a {
        public /* synthetic */ C3101a(AbstractC6112h abstractC6112h) {
            this();
        }

        private C3101a() {
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.TextDialogActivity$b */
    static final class C3102b extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12829a;

        C3102b(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return TextDialogActivity.this.new C3102b(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((C3102b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f12829a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            InterfaceC2983e interfaceC2983eMo15146G = TextDialogActivity.this.m15662w4().mo15146G();
            C5211c c5211c = TextDialogActivity.this.f12821M0;
            AbstractC6118n.m27184b(c5211c);
            interfaceC2983eMo15146G.mo14861b(c5211c);
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.TextDialogActivity$c */
    public static final class C3103c extends UtteranceProgressListener {
        C3103c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final void m15671d(TextDialogActivity textDialogActivity) {
            textDialogActivity.f12827S0 = false;
            textDialogActivity.m15645X4();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public static final void m15672e(TextDialogActivity textDialogActivity) {
            textDialogActivity.f12827S0 = false;
            textDialogActivity.m15645X4();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final void m15673f(TextDialogActivity textDialogActivity) {
            textDialogActivity.f12827S0 = true;
            textDialogActivity.m15645X4();
        }

        @Override // android.speech.tts.UtteranceProgressListener
        public void onDone(String str) {
            final TextDialogActivity textDialogActivity = TextDialogActivity.this;
            textDialogActivity.runOnUiThread(new Runnable() { // from class: l1.q1
                @Override // java.lang.Runnable
                public final void run() {
                    TextDialogActivity.C3103c.m15671d(textDialogActivity);
                }
            });
        }

        @Override // android.speech.tts.UtteranceProgressListener
        public void onError(String str) {
            final TextDialogActivity textDialogActivity = TextDialogActivity.this;
            textDialogActivity.runOnUiThread(new Runnable() { // from class: l1.p1
                @Override // java.lang.Runnable
                public final void run() {
                    TextDialogActivity.C3103c.m15672e(textDialogActivity);
                }
            });
        }

        @Override // android.speech.tts.UtteranceProgressListener
        public void onStart(String str) {
            final TextDialogActivity textDialogActivity = TextDialogActivity.this;
            textDialogActivity.runOnUiThread(new Runnable() { // from class: l1.r1
                @Override // java.lang.Runnable
                public final void run() {
                    TextDialogActivity.C3103c.m15673f(textDialogActivity);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.TextDialogActivity$d */
    public static final class ActionModeCallbackC3104d implements ActionMode.Callback {
        ActionModeCallbackC3104d() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            if (menu == null) {
                return true;
            }
            menu.clear();
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            if (menu == null) {
                return true;
            }
            menu.clear();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.TextDialogActivity$e */
    static final class C3105e extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        Object f12832a;

        /* JADX INFO: renamed from: b */
        Object f12833b;

        /* JADX INFO: renamed from: c */
        Object f12834c;

        /* JADX INFO: renamed from: d */
        Object f12835d;

        /* JADX INFO: renamed from: e */
        Object f12836e;

        /* JADX INFO: renamed from: f */
        int f12837f;

        /* JADX INFO: renamed from: s */
        final /* synthetic */ Uri f12839s;

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.TextDialogActivity$e$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f12840a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ TextDialogActivity f12841b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TextDialogActivity textDialogActivity, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f12841b = textDialogActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f12841b, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f12840a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                this.f12841b.m15640S4(R.string.error_file_too_large);
                this.f12841b.finish();
                return C1444v.f4971a;
            }
        }

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.TextDialogActivity$e$b */
        static final class b extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f12842a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ View f12843b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ TextDialogActivity f12844c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ StringBuilder f12845d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(View view, TextDialogActivity textDialogActivity, StringBuilder sb, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f12843b = view;
                this.f12844c = textDialogActivity;
                this.f12845d = sb;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new b(this.f12843b, this.f12844c, this.f12845d, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f12842a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                View view = this.f12843b;
                AbstractC6118n.m27184b(view);
                view.setVisibility(8);
                TextDialogActivity textDialogActivity = this.f12844c;
                String string = this.f12845d.toString();
                AbstractC6118n.m27186d(string, "toString(...)");
                if (AbstractC3041D.m15081f(textDialogActivity, string)) {
                    TextView textView = this.f12844c.f12823O0;
                    if (textView == null) {
                        AbstractC6118n.m27197o("textContent");
                        textView = null;
                    }
                    String string2 = this.f12845d.toString();
                    AbstractC6118n.m27186d(string2, "toString(...)");
                    textView.setText(AbstractC6406h.m27594S0(string2).toString());
                } else {
                    this.f12844c.finish();
                }
                return C1444v.f4971a;
            }
        }

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.TextDialogActivity$e$c */
        static final class c extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f12846a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ TextDialogActivity f12847b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(TextDialogActivity textDialogActivity, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f12847b = textDialogActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new c(this.f12847b, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((c) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f12846a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                this.f12847b.m15640S4(R.string.error_read_file);
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3105e(Uri uri, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f12839s = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return TextDialogActivity.this.new C3105e(this.f12839s, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((C3105e) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        /* JADX WARN: Code duplicated, block: B:53:0x0103  */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0140, code lost:
        
            if (p318o6.AbstractC6668i.m28186g(r12, r1, r11) == r0) goto L71;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v11, types: [java.io.InputStream, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v11, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r3v13, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v6, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r7v7 */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ?? OpenInputStream;
            View viewFindViewById;
            TextDialogActivity textDialogActivity;
            Closeable closeable;
            Closeable closeable2;
            ?? r7;
            StringBuilder sb;
            AbstractC6615I0 abstractC6615I0M28164c;
            b bVar;
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f12837f;
            ?? r8 = 3;
            try {
                try {
                    if (i7 == 0) {
                        AbstractC1437o.m6082b(obj);
                        if (AbstractC3041D.m15084i(TextDialogActivity.this, this.f12839s) > 512000) {
                            AbstractC6615I0 abstractC6615I0M28164c2 = C6656c0.m28164c();
                            a aVar = new a(TextDialogActivity.this, null);
                            this.f12837f = 1;
                            if (AbstractC6668i.m28186g(abstractC6615I0M28164c2, aVar, this) == objE) {
                            }
                            return C1444v.f4971a;
                        }
                        String strM15079d = AbstractC3041D.m15079d(TextDialogActivity.this, this.f12839s);
                        if (strM15079d == null) {
                            strM15079d = "UTF-8";
                        }
                        viewFindViewById = TextDialogActivity.this.findViewById(R.id.progress_horizontal);
                        AbstractC6118n.m27184b(viewFindViewById);
                        viewFindViewById.setVisibility(0);
                        OpenInputStream = TextDialogActivity.this.getContentResolver().openInputStream(this.f12839s);
                        if (OpenInputStream != 0) {
                            textDialogActivity = TextDialogActivity.this;
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream) OpenInputStream, strM15079d));
                                try {
                                    StringBuilder sb2 = new StringBuilder();
                                    while (true) {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        sb2.append(line);
                                        sb2.append("\n");
                                    }
                                    this.f12832a = viewFindViewById;
                                    this.f12833b = OpenInputStream;
                                    this.f12834c = textDialogActivity;
                                    this.f12835d = bufferedReader;
                                    this.f12836e = sb2;
                                    this.f12837f = 2;
                                    if (AbstractC6645Y.m28137a(1000L, this) != objE) {
                                        closeable2 = bufferedReader;
                                        r7 = OpenInputStream;
                                        sb = sb2;
                                        abstractC6615I0M28164c = C6656c0.m28164c();
                                        bVar = new b(viewFindViewById, textDialogActivity, sb, null);
                                        this.f12832a = r7;
                                        this.f12833b = closeable2;
                                        this.f12834c = null;
                                        this.f12835d = null;
                                        this.f12836e = null;
                                        this.f12837f = 3;
                                        if (AbstractC6668i.m28186g(abstractC6615I0M28164c, bVar, this) != objE) {
                                            closeable = closeable2;
                                            r8 = r7;
                                            C1444v c1444v = C1444v.f4971a;
                                            AbstractC3026b.m14999a(closeable, null);
                                            AbstractC3026b.m14999a(r8, null);
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    r8 = OpenInputStream;
                                    closeable = bufferedReader;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    AbstractC3026b.m14999a(OpenInputStream, th);
                                    throw th3;
                                }
                            }
                        }
                        return objE;
                    }
                    if (i7 == 1) {
                        AbstractC1437o.m6082b(obj);
                        return C1444v.f4971a;
                    }
                    if (i7 == 2) {
                        sb = (StringBuilder) this.f12836e;
                        closeable2 = (Closeable) this.f12835d;
                        textDialogActivity = (TextDialogActivity) this.f12834c;
                        r7 = (Closeable) this.f12833b;
                        viewFindViewById = (View) this.f12832a;
                        try {
                            AbstractC1437o.m6082b(obj);
                            r7 = r7;
                            abstractC6615I0M28164c = C6656c0.m28164c();
                            bVar = new b(viewFindViewById, textDialogActivity, sb, null);
                            this.f12832a = r7;
                            this.f12833b = closeable2;
                            this.f12834c = null;
                            this.f12835d = null;
                            this.f12836e = null;
                            this.f12837f = 3;
                            if (AbstractC6668i.m28186g(abstractC6615I0M28164c, bVar, this) != objE) {
                                closeable = closeable2;
                                r8 = r7;
                                C1444v c1444v2 = C1444v.f4971a;
                                AbstractC3026b.m14999a(closeable, null);
                                AbstractC3026b.m14999a(r8, null);
                            }
                            return objE;
                        } catch (Throwable th4) {
                            th = th4;
                            closeable = closeable2;
                            r8 = r7;
                            throw th;
                        }
                    }
                    if (i7 == 3) {
                        closeable = (Closeable) this.f12833b;
                        r8 = (Closeable) this.f12832a;
                        try {
                            AbstractC1437o.m6082b(obj);
                            r8 = r8;
                            C1444v c1444v3 = C1444v.f4971a;
                            AbstractC3026b.m14999a(closeable, null);
                            AbstractC3026b.m14999a(r8, null);
                        } catch (Throwable th5) {
                            th = th5;
                            try {
                                throw th;
                            } catch (Throwable th6) {
                                AbstractC3026b.m14999a(closeable, th);
                                throw th6;
                            }
                        }
                    } else {
                        if (i7 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1437o.m6082b(obj);
                    }
                } catch (Exception e7) {
                    Log.e("TextDialogActivity", "Error reading text file", e7);
                    AbstractC6615I0 abstractC6615I0M28164c3 = C6656c0.m28164c();
                    c cVar = new c(TextDialogActivity.this, null);
                    this.f12832a = null;
                    this.f12833b = null;
                    this.f12834c = null;
                    this.f12835d = null;
                    this.f12836e = null;
                    this.f12837f = 4;
                }
                return C1444v.f4971a;
            } catch (Throwable th7) {
                th = th7;
                OpenInputStream = r8;
                throw th;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: A4 */
    private final void m15623A4(Intent intent) {
        String action = intent.getAction();
        String type = intent.getType();
        if (intent.hasExtra(AbstractViewOnClickListenerC3141a.f13140d1.m16595b())) {
            ActionsLayout actionsLayout = this.f12822N0;
            Toolbar toolbar = null;
            if (actionsLayout == null) {
                AbstractC6118n.m27197o("actions");
                actionsLayout = null;
            }
            actionsLayout.inflateMenu(R.menu.symbol_menu_note);
            ActionsLayout actionsLayout2 = this.f12822N0;
            if (actionsLayout2 == null) {
                AbstractC6118n.m27197o("actions");
                actionsLayout2 = null;
            }
            actionsLayout2.removeItem(R.id.swap);
            ActionsLayout actionsLayout3 = this.f12822N0;
            if (actionsLayout3 == null) {
                AbstractC6118n.m27197o("actions");
                actionsLayout3 = null;
            }
            actionsLayout3.removeItem(R.id.send_text);
            Toolbar toolbar2 = this.f12824P0;
            if (toolbar2 == null) {
                AbstractC6118n.m27197o("toolbar");
            } else {
                toolbar = toolbar2;
            }
            toolbar.getMenu().removeItem(R.id.item_open);
            m15626D4(intent);
            return;
        }
        if (action != null) {
            switch (action.hashCode()) {
                case -1173683121:
                    if (action.equals("android.intent.action.EDIT")) {
                        m15664y4(intent);
                        return;
                    }
                    break;
                case -1173264947:
                    if (action.equals("android.intent.action.SEND")) {
                        m15625C4(intent, type);
                        return;
                    }
                    break;
                case -1173171990:
                    if (action.equals("android.intent.action.VIEW")) {
                        m15627E4(intent, type);
                        return;
                    }
                    break;
                case 1703997026:
                    if (action.equals("android.intent.action.PROCESS_TEXT")) {
                        m15624B4(intent, type);
                        return;
                    }
                    break;
            }
        }
        Log.w("TextDialogActivity", "Unhandled intent action: " + action);
    }

    /* JADX INFO: renamed from: B4 */
    private final void m15624B4(Intent intent, String str) {
        try {
            String stringExtra = intent.getStringExtra("android.intent.extra.PROCESS_TEXT");
            if (stringExtra != null) {
                if (!AbstractC3041D.m15081f(this, stringExtra)) {
                    finish();
                    return;
                }
                TextView textView = this.f12823O0;
                if (textView == null) {
                    AbstractC6118n.m27197o("textContent");
                    textView = null;
                }
                textView.setText(stringExtra);
            }
        } catch (Exception unused) {
            m15640S4(R.string.error_processing_text);
        }
    }

    /* JADX INFO: renamed from: C4 */
    private final void m15625C4(Intent intent, String str) {
        try {
            String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
            if (stringExtra == null) {
                Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
                if (uri != null) {
                    m15636O4(uri);
                    return;
                }
                return;
            }
            if (!AbstractC3041D.m15081f(this, stringExtra)) {
                finish();
                return;
            }
            TextView textView = this.f12823O0;
            if (textView == null) {
                AbstractC6118n.m27197o("textContent");
                textView = null;
            }
            textView.setText(stringExtra);
        } catch (Exception e7) {
            Log.e("TextDialogActivity", "Error in handleSendIntent", e7);
            m15640S4(R.string.error_reading_shared_text);
        }
    }

    /* JADX INFO: renamed from: D4 */
    private final void m15626D4(Intent intent) {
        try {
            Serializable serializableExtra = intent.getSerializableExtra(AbstractViewOnClickListenerC3141a.f13140d1.m16595b());
            AbstractC6118n.m27185c(serializableExtra, "null cannot be cast to non-null type com.anas_mugally.clipboard.database.entity.Text");
            C5211c c5211c = (C5211c) serializableExtra;
            if (!AbstractC3041D.m15081f(this, c5211c.m24112f())) {
                finish();
                return;
            }
            this.f12821M0 = c5211c;
            TextView textView = this.f12823O0;
            if (textView == null) {
                AbstractC6118n.m27197o("textContent");
                textView = null;
            }
            C5211c c5211c2 = this.f12821M0;
            AbstractC6118n.m27184b(c5211c2);
            textView.setText(c5211c2.m24112f());
        } catch (Exception unused) {
            m15640S4(R.string.error_viewing_text);
        }
    }

    /* JADX INFO: renamed from: E4 */
    private final void m15627E4(Intent intent, String str) {
        Uri data;
        if (str != null) {
            try {
                if (!AbstractC6406h.m27557K(str, "text/", false, 2, null) || (data = intent.getData()) == null) {
                    return;
                }
                m15636O4(data);
            } catch (Exception unused) {
                m15640S4(R.string.error_viewing_text);
            }
        }
    }

    /* JADX INFO: renamed from: F4 */
    private final void m15628F4() {
        this.f12826R0 = new TextToSpeech(this, new TextToSpeech.OnInitListener() { // from class: l1.l1
            @Override // android.speech.tts.TextToSpeech.OnInitListener
            public final void onInit(int i7) {
                TextDialogActivity.m15629G4(this.f24044a, i7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G4 */
    public static final void m15629G4(TextDialogActivity textDialogActivity, int i7) {
        if (i7 != 0) {
            Log.e("TextDialogActivity", "TextToSpeech initialization failed");
            return;
        }
        TextToSpeech textToSpeech = textDialogActivity.f12826R0;
        Integer numValueOf = textToSpeech != null ? Integer.valueOf(textToSpeech.setLanguage(Locale.getDefault())) : null;
        if ((numValueOf != null && numValueOf.intValue() == -1) || (numValueOf != null && numValueOf.intValue() == -2)) {
            Log.w("TextDialogActivity", "Language not supported for TTS");
            TextToSpeech textToSpeech2 = textDialogActivity.f12826R0;
            if (textToSpeech2 != null) {
                textToSpeech2.setLanguage(Locale.ENGLISH);
            }
        }
        TextToSpeech textToSpeech3 = textDialogActivity.f12826R0;
        if (textToSpeech3 != null) {
            textToSpeech3.setOnUtteranceProgressListener(textDialogActivity.new C3103c());
        }
    }

    /* JADX INFO: renamed from: I4 */
    private final boolean m15630I4(final int i7) {
        if (i7 == R.id.more) {
            return true;
        }
        m16261j3(new InterfaceC5356a() { // from class: l1.o1
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return TextDialogActivity.m15631J4(this.f24053a, i7);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J4 */
    public static final C1444v m15631J4(TextDialogActivity textDialogActivity, int i7) {
        textDialogActivity.m15632K4(i7);
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: K4 */
    private final void m15632K4(int i7) {
        ActionsLayout actionsLayout = null;
        switch (i7) {
            case R.id.delete /* 2131296517 */:
                m15661v4();
                finish();
                break;
            case R.id.edit /* 2131296553 */:
                m15665z4(i7);
                finish();
                break;
            case R.id.replace /* 2131296915 */:
                C5400E.f20566F0.m24487a().mo7649g2(m12232H0(), null);
                break;
            case R.id.toolbar /* 2131297107 */:
                C3139c.a aVar = C3139c.f13112o;
                Application application = getApplication();
                AbstractC6118n.m27186d(application, "getApplication(...)");
                aVar.m16456a(application).m16455T(m15663x4());
                finish();
                break;
            default:
                C5920K c5920k = new C5920K(this, m15663x4(), false);
                ActionsLayout actionsLayout2 = this.f12822N0;
                if (actionsLayout2 == null) {
                    AbstractC6118n.m27197o("actions");
                } else {
                    actionsLayout = actionsLayout2;
                }
                ImageButton imageButton = actionsLayout.getItemViewMap().get(Integer.valueOf(i7));
                AbstractC6118n.m27184b(imageButton);
                c5920k.m26717s(imageButton, m15662w4());
                c5920k.m26716i(i7);
                break;
        }
        m15644W4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L4 */
    public static final boolean m15633L4(TextDialogActivity textDialogActivity, MenuItem it) {
        AbstractC6118n.m27187e(it, "it");
        textDialogActivity.m15630I4(it.getItemId());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M4 */
    public static final C1444v m15634M4(TextDialogActivity textDialogActivity, ComponentName componentName, ActionsLayout.EnumC3037c type) {
        AbstractC6118n.m27187e(type, "type");
        AbstractC3041D.m15090o(textDialogActivity, textDialogActivity.m15663x4(), componentName, type, false, 8, null);
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N4 */
    public static final C1444v m15635N4(TextDialogActivity textDialogActivity, AbstractC5158A addCallback) {
        AbstractC6118n.m27187e(addCallback, "$this$addCallback");
        textDialogActivity.finishAndRemoveTask();
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: O4 */
    private final void m15636O4(Uri uri) {
        AbstractC6672k.m28227d(AbstractC2658t.m12641a(this), C6656c0.m28163b(), null, new C3105e(uri, null), 2, null);
    }

    /* JADX INFO: renamed from: P4 */
    private final void m15637P4() {
        final Toolbar toolbar = this.f12824P0;
        if (toolbar == null) {
            AbstractC6118n.m27197o("toolbar");
            toolbar = null;
        }
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: l1.m1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextDialogActivity.m15638Q4(toolbar, this, view);
            }
        });
        toolbar.setOnMenuItemClickListener(new Toolbar.InterfaceC2332h() { // from class: l1.n1
            @Override // androidx.appcompat.widget.Toolbar.InterfaceC2332h
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return TextDialogActivity.m15639R4(this.f24049a, toolbar, menuItem);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q4 */
    public static final void m15638Q4(Toolbar toolbar, TextDialogActivity textDialogActivity, View view) {
        Context context = toolbar.getContext();
        AbstractC6118n.m27186d(context, "getContext(...)");
        if (AbstractC3041D.m15080e(context)) {
            C3034A c3034a = C3034A.f12453a;
            Context context2 = toolbar.getContext();
            AbstractC6118n.m27186d(context2, "getContext(...)");
            c3034a.m15030d(context2);
            return;
        }
        Toolbar toolbar2 = textDialogActivity.f12824P0;
        if (toolbar2 == null) {
            AbstractC6118n.m27197o("toolbar");
            toolbar2 = null;
        }
        textDialogActivity.m15630I4(toolbar2.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R4 */
    public static final boolean m15639R4(TextDialogActivity textDialogActivity, Toolbar toolbar, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != R.id.item_ai_text_processing) {
            if (itemId == R.id.item_open) {
                textDialogActivity.startActivity(new Intent(textDialogActivity.getApplication(), (Class<?>) BrowserNotesFullActivity.class));
                textDialogActivity.finish();
                return true;
            }
            if (itemId != R.id.item_text_to_speech) {
                return false;
            }
            textDialogActivity.f12828T0 = menuItem;
            textDialogActivity.m15643V4();
            return true;
        }
        Intent intent = new Intent(toolbar.getContext(), (Class<?>) AiTextProcessingActivity.class);
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", textDialogActivity.m15663x4());
        intent.putExtra(AbstractViewOnClickListenerC3141a.f13140d1.m16596c(), textDialogActivity.f12821M0 != null);
        intent.addFlags(268468224);
        toolbar.getContext().startActivity(intent);
        textDialogActivity.finish();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public final void m15640S4(int i7) {
        Toast.makeText(this, i7, 0).show();
    }

    /* JADX INFO: renamed from: T4 */
    private final void m15641T4() {
        String strM15663x4 = m15663x4();
        if (strM15663x4.length() == 0) {
            Toast.makeText(this, R.string.empty_text, 0).show();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("utteranceId", "utteranceId");
        TextToSpeech textToSpeech = this.f12826R0;
        if (textToSpeech != null) {
            textToSpeech.speak(strM15663x4, 0, bundle, "utteranceId");
        }
        this.f12827S0 = true;
        m15645X4();
    }

    /* JADX INFO: renamed from: U4 */
    private final void m15642U4() {
        TextToSpeech textToSpeech = this.f12826R0;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        this.f12827S0 = false;
        m15645X4();
    }

    /* JADX INFO: renamed from: V4 */
    private final void m15643V4() {
        if (this.f12826R0 == null) {
            Toast.makeText(this, R.string.tts_not_available, 0).show();
        } else if (this.f12827S0) {
            m15642U4();
        } else {
            m15641T4();
        }
    }

    /* JADX INFO: renamed from: W4 */
    private final boolean m15644W4() {
        SharedPreferences sharedPreferencesM15843T1 = m15843T1();
        C6327h.a aVar = C6327h.f24159H0;
        if (sharedPreferencesM15843T1.getBoolean(aVar.m27282b(), false) || !C3034A.f12453a.m15015B(this)) {
            return false;
        }
        aVar.m27281a().mo7649g2(m12232H0(), null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public final void m15645X4() {
        MenuItem menuItem = this.f12828T0;
        if (menuItem != null) {
            menuItem.setIcon(this.f12827S0 ? R.drawable.ic_round_volume_off_24 : R.drawable.ic_round_volume_up_24);
        }
        MenuItem menuItem2 = this.f12828T0;
        if (menuItem2 != null) {
            menuItem2.setTitle(this.f12827S0 ? R.string.text_to_speech_stop : R.string.text_to_speech);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public static final AppDatabase m15660u4(TextDialogActivity textDialogActivity) {
        return AppDatabase.f12597p.m15148b(textDialogActivity);
    }

    /* JADX INFO: renamed from: v4 */
    private final void m15661v4() {
        AbstractC6672k.m28227d(AbstractC2658t.m12641a(this), C6656c0.m28163b(), null, new C3102b(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public final AppDatabase m15662w4() {
        return (AppDatabase) this.f12820L0.getValue();
    }

    /* JADX INFO: renamed from: x4 */
    private final String m15663x4() {
        try {
            TextView textView = this.f12823O0;
            TextView textView2 = null;
            if (textView == null) {
                AbstractC6118n.m27197o("textContent");
                textView = null;
            }
            if (!textView.hasSelection()) {
                TextView textView3 = this.f12823O0;
                if (textView3 == null) {
                    AbstractC6118n.m27197o("textContent");
                } else {
                    textView2 = textView3;
                }
                return textView2.getText().toString();
            }
            TextView textView4 = this.f12823O0;
            if (textView4 == null) {
                AbstractC6118n.m27197o("textContent");
                textView4 = null;
            }
            String string = textView4.getText().toString();
            TextView textView5 = this.f12823O0;
            if (textView5 == null) {
                AbstractC6118n.m27197o("textContent");
                textView5 = null;
            }
            int selectionStart = textView5.getSelectionStart();
            TextView textView6 = this.f12823O0;
            if (textView6 == null) {
                AbstractC6118n.m27197o("textContent");
            } else {
                textView2 = textView6;
            }
            String strSubstring = string.substring(selectionStart, textView2.getSelectionEnd());
            AbstractC6118n.m27186d(strSubstring, "substring(...)");
            return strSubstring;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: y4 */
    private final void m15664y4(Intent intent) {
        try {
            Uri data = intent.getData();
            if (data != null) {
                m15636O4(data);
            }
        } catch (Exception unused) {
            m15640S4(R.string.error_editing_text);
        }
    }

    /* JADX INFO: renamed from: z4 */
    private final void m15665z4(int i7) {
        C5211c c5211c = this.f12821M0;
        AbstractC6118n.m27184b(c5211c);
        if (AbstractC3041D.m15081f(this, c5211c.m24112f())) {
            Intent intent = new Intent(this, (Class<?>) AddNoteActivity.class);
            AbstractViewOnClickListenerC3141a.a aVar = AbstractViewOnClickListenerC3141a.f13140d1;
            startActivity(intent.putExtra(aVar.m16595b(), this.f12821M0).putExtra(aVar.m16596c(), this.f12821M0 != null));
        }
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a
    /* JADX INFO: renamed from: D2 */
    protected Set mo15494D2() {
        if (m15845V1()) {
            return AbstractC1617O.m6652f(AbstractActivityC3130a.d.INTERSTITIAL, AbstractActivityC3130a.d.APP_OPEN, AbstractActivityC3130a.d.NATIVE);
        }
        return null;
    }

    /* JADX INFO: renamed from: H4 */
    public void m15666H4(String p7, String p8, boolean z7) {
        AbstractC6118n.m27187e(p7, "p1");
        AbstractC6118n.m27187e(p8, "p2");
        TextView textView = this.f12823O0;
        if (textView == null) {
            AbstractC6118n.m27197o("textContent");
            textView = null;
        }
        String string = textView.getText().toString();
        textView.setText(!z7 ? AbstractC6406h.m27551E(string, p7, p8, false, 4, null) : AbstractC6406h.m27553G(string, p7, p8, false, 4, null));
    }

    @Override // p238e6.InterfaceC5372q
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ Object mo7830j(Object obj, Object obj2, Object obj3) {
        m15666H4((String) obj, (String) obj2, ((Boolean) obj3).booleanValue());
        return C1444v.f4971a;
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity, com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a, com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, com.anas_mugally.clipboard.p221ui.AbstractActivityC3140d, androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        MenuItem menuItemFindItem;
        super.onCreate(bundle);
        setContentView(R.layout.activity_text_dialog);
        this.f12823O0 = (TextView) findViewById(R.id.text_content);
        this.f12822N0 = (ActionsLayout) findViewById(R.id.actions_layout);
        this.f12824P0 = (Toolbar) findViewById(R.id.toolbar);
        this.f12825Q0 = (ViewGroup) findViewById(R.id.lay_ad);
        m15637P4();
        Intent intent = getIntent();
        AbstractC6118n.m27186d(intent, "getIntent(...)");
        m15623A4(intent);
        ActionsLayout actionsLayout = this.f12822N0;
        TextView textView = null;
        if (actionsLayout == null) {
            AbstractC6118n.m27197o("actions");
            actionsLayout = null;
        }
        Menu menu = actionsLayout.getMenu();
        if (menu != null && (menuItemFindItem = menu.findItem(R.id.send_text)) != null) {
            menuItemFindItem.setVisible(Build.VERSION.SDK_INT >= 28);
        }
        ActionsLayout actionsLayout2 = this.f12822N0;
        if (actionsLayout2 == null) {
            AbstractC6118n.m27197o("actions");
            actionsLayout2 = null;
        }
        actionsLayout2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l1.i1
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return TextDialogActivity.m15633L4(this.f24030a, menuItem);
            }
        });
        ActionsLayout actionsLayout3 = this.f12822N0;
        if (actionsLayout3 == null) {
            AbstractC6118n.m27197o("actions");
            actionsLayout3 = null;
        }
        actionsLayout3.setOnMoreAppsItemClickListener(new InterfaceC5371p() { // from class: l1.j1
            @Override // p238e6.InterfaceC5371p
            public final Object invoke(Object obj, Object obj2) {
                return TextDialogActivity.m15634M4(this.f24033a, (ComponentName) obj, (ActionsLayout.EnumC3037c) obj2);
            }
        });
        TextView textView2 = this.f12823O0;
        if (textView2 == null) {
            AbstractC6118n.m27197o("textContent");
        } else {
            textView = textView2;
        }
        textView.setCustomSelectionActionModeCallback(new ActionModeCallbackC3104d());
        AbstractC5166I.m23950b(mo12238b(), null, false, new InterfaceC5367l() { // from class: l1.k1
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return TextDialogActivity.m15635N4(this.f24038a, (AbstractC5158A) obj);
            }
        }, 3, null);
        m15628F4();
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity, androidx.appcompat.app.AbstractActivityC2242c, androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onDestroy() {
        TextToSpeech textToSpeech = this.f12826R0;
        if (textToSpeech != null) {
            if (textToSpeech != null) {
                textToSpeech.stop();
            }
            TextToSpeech textToSpeech2 = this.f12826R0;
            if (textToSpeech2 != null) {
                textToSpeech2.shutdown();
            }
            this.f12826R0 = null;
        }
        super.onDestroy();
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity, com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a, com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onResume() {
        ViewGroup viewGroup;
        super.onResume();
        ViewGroup viewGroup2 = this.f12825Q0;
        if (viewGroup2 == null) {
            AbstractC6118n.m27197o("layAd");
            viewGroup2 = null;
        }
        viewGroup2.setVisibility(m15845V1() ? 0 : 8);
        if (m15845V1()) {
            ViewGroup viewGroup3 = this.f12825Q0;
            if (viewGroup3 == null) {
                AbstractC6118n.m27197o("layAd");
                viewGroup = null;
            } else {
                viewGroup = viewGroup3;
            }
            BaseMyAppAdsActivity.m16158V3(this, viewGroup, R.layout.myapp_naitve_small, null, 4, null);
        }
    }
}
