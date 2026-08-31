package com.anas_mugally.clipboard.p221ui.p222ai.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.p221ui.p222ai.models.AiPrompt;
import com.google.gson.C5026e;
import com.google.gson.reflect.C5058a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1638q;
import p238e6.InterfaceC5367l;

/* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ai.utils.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3135b {

    /* JADX INFO: renamed from: a */
    public static final a f13105a = new a(null);

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ai.utils.b$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ai.utils.b$b */
    public static final class b extends C5058a<List<? extends AiPrompt>> {
        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final boolean m16375c(String str, AiPrompt it) {
        AbstractC6118n.m27187e(it, "it");
        return AbstractC6118n.m27183a(it.getId(), str);
    }

    /* JADX INFO: renamed from: A */
    public final void m16376A(Context context, AiPrompt prompt) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(prompt, "prompt");
        int i7 = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("ai_prompts", 0);
        List listJ0 = AbstractC1638q.m6596j0(m16395u(context));
        Iterator it = listJ0.iterator();
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            } else if (AbstractC6118n.m27183a(((AiPrompt) it.next()).getId(), prompt.getId())) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 != -1) {
            listJ0.set(i7, prompt);
        } else {
            listJ0.add(prompt);
        }
        sharedPreferences.edit().putString("saved_prompts", new C5026e().m22630s(listJ0)).apply();
    }

    /* JADX INFO: renamed from: b */
    public final void m16377b(Context context, final String promptId) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(promptId, "promptId");
        SharedPreferences sharedPreferences = context.getSharedPreferences("ai_prompts", 0);
        List listJ0 = AbstractC1638q.m6596j0(m16395u(context));
        AbstractC1638q.m6783z(listJ0, new InterfaceC5367l() { // from class: com.anas_mugally.clipboard.ui.ai.utils.a
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C3135b.m16375c(promptId, (AiPrompt) obj));
            }
        });
        sharedPreferences.edit().putString("saved_prompts", new C5026e().m22630s(listJ0)).apply();
    }

    /* JADX INFO: renamed from: d */
    public final AiPrompt m16378d() {
        return new AiPrompt("bullet_points", "Bullet Points", "", false, 0L, 16, null);
    }

    /* JADX INFO: renamed from: e */
    public final AiPrompt m16379e() {
        return new AiPrompt("correct_all", "Correct All", "", false, 0L, 16, null);
    }

    /* JADX INFO: renamed from: f */
    public final AiPrompt m16380f() {
        return new AiPrompt("creative_rewrite", "Creative Style", "", false, 0L, 16, null);
    }

    /* JADX INFO: renamed from: g */
    public final AiPrompt m16381g(String title, String prompt) {
        AbstractC6118n.m27187e(title, "title");
        AbstractC6118n.m27187e(prompt, "prompt");
        return new AiPrompt("custom", title, prompt, true, 0L, 16, null);
    }

    /* JADX INFO: renamed from: h */
    public final AiPrompt m16382h() {
        return new AiPrompt("emoji_rewrite", "Emoji Style", "", false, 0L, 16, null);
    }

    /* JADX INFO: renamed from: i */
    public final AiPrompt m16383i() {
        return new AiPrompt("expand_text", "Expand Text", "", false, 0L, 16, null);
    }

    /* JADX INFO: renamed from: j */
    public final AiPrompt m16384j() {
        return new AiPrompt("extract_contacts", "Extract Emails & Phones", "", false, 0L, 16, null);
    }

    /* JADX INFO: renamed from: k */
    public final AiPrompt m16385k() {
        return new AiPrompt("extract_keywords", "Extract Keywords", "", false, 0L, 16, null);
    }

    /* JADX INFO: renamed from: l */
    public final AiPrompt m16386l() {
        return new AiPrompt("extract_names", "Extract Names & Places", "", false, 0L, 16, null);
    }

    /* JADX INFO: renamed from: m */
    public final AiPrompt m16387m() {
        return new AiPrompt("extract_numbers", "Extract Numbers & Dates", "", false, 0L, 16, null);
    }

    /* JADX INFO: renamed from: n */
    public final AiPrompt m16388n() {
        return new AiPrompt("formal_rewrite", "Formal Style", "", false, 0L, 16, null);
    }

    /* JADX INFO: renamed from: o */
    public final AiPrompt m16389o(String title, String prompt) {
        AbstractC6118n.m27187e(title, "title");
        AbstractC6118n.m27187e(prompt, "prompt");
        return new AiPrompt("custom", title, prompt, true, 0L, 16, null);
    }

    /* JADX INFO: renamed from: p */
    public final AiPrompt m16390p() {
        return new AiPrompt("not_formal_rewrite", "Informal Style", "", false, 0L, 16, null);
    }

    /* JADX INFO: renamed from: q */
    public final AiPrompt m16391q() {
        return new AiPrompt("key_points", "Key Points", "", false, 0L, 16, null);
    }

    /* JADX INFO: renamed from: r */
    public final AiPrompt m16392r() {
        return new AiPrompt("polite_rewrite", "Polite Style", "", false, 0L, 16, null);
    }

    /* JADX INFO: renamed from: s */
    public final AiPrompt m16393s() {
        return new AiPrompt("professional_rewrite", "Professional Style", "", false, 0L, 16, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: t */
    public final String m16394t(Context context, AiPrompt prompt) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(prompt, "prompt");
        String id = prompt.getId();
        switch (id.hashCode()) {
            case -1961885062:
                if (id.equals("polite_rewrite")) {
                    String string = context.getString(R.string.polite_rewrite);
                    AbstractC6118n.m27186d(string, "getString(...)");
                    return string;
                }
                break;
            case -1840647503:
                if (id.equals("translation")) {
                    String string2 = context.getString(R.string.translate);
                    AbstractC6118n.m27186d(string2, "getString(...)");
                    return string2;
                }
                break;
            case -1447776576:
                if (id.equals("bullet_points")) {
                    String string3 = context.getString(R.string.bullet_points);
                    AbstractC6118n.m27186d(string3, "getString(...)");
                    return string3;
                }
                break;
            case -1272270189:
                if (id.equals("emoji_rewrite")) {
                    String string4 = context.getString(R.string.emoji_rewrite);
                    AbstractC6118n.m27186d(string4, "getString(...)");
                    return string4;
                }
                break;
            case -1076283823:
                if (id.equals("extract_contacts")) {
                    String string5 = context.getString(R.string.extract_contacts);
                    AbstractC6118n.m27186d(string5, "getString(...)");
                    return string5;
                }
                break;
            case -745109584:
                if (id.equals("punctuation_fix")) {
                    String string6 = context.getString(R.string.punctuation_fix);
                    AbstractC6118n.m27186d(string6, "getString(...)");
                    return string6;
                }
                break;
            case -673828166:
                if (id.equals("social_rewrite")) {
                    String string7 = context.getString(R.string.social_rewrite);
                    AbstractC6118n.m27186d(string7, "getString(...)");
                    return string7;
                }
                break;
            case -437440590:
                if (id.equals("expand_text")) {
                    String string8 = context.getString(R.string.expand_text);
                    AbstractC6118n.m27186d(string8, "getString(...)");
                    return string8;
                }
                break;
            case -373451037:
                if (id.equals("short_summary")) {
                    String string9 = context.getString(R.string.short_summary);
                    AbstractC6118n.m27186d(string9, "getString(...)");
                    return string9;
                }
                break;
            case -268832246:
                if (id.equals("extract_names")) {
                    String string10 = context.getString(R.string.extract_names);
                    AbstractC6118n.m27186d(string10, "getString(...)");
                    return string10;
                }
                break;
            case -77266804:
                if (id.equals("extract_numbers")) {
                    String string11 = context.getString(R.string.extract_numbers);
                    AbstractC6118n.m27186d(string11, "getString(...)");
                    return string11;
                }
                break;
            case 14316968:
                if (id.equals("extract_keywords")) {
                    String string12 = context.getString(R.string.extract_keywords);
                    AbstractC6118n.m27186d(string12, "getString(...)");
                    return string12;
                }
                break;
            case 230542129:
                if (id.equals("spell_check")) {
                    String string13 = context.getString(R.string.spell_check);
                    AbstractC6118n.m27186d(string13, "getString(...)");
                    return string13;
                }
                break;
            case 289290239:
                if (id.equals("simple_rewrite")) {
                    String string14 = context.getString(R.string.simple_rewrite);
                    AbstractC6118n.m27186d(string14, "getString(...)");
                    return string14;
                }
                break;
            case 435987139:
                if (id.equals("key_points")) {
                    String string15 = context.getString(R.string.key_points);
                    AbstractC6118n.m27186d(string15, "getString(...)");
                    return string15;
                }
                break;
            case 627692584:
                if (id.equals("not_formal_rewrite")) {
                    String string16 = context.getString(R.string.informal_rewrite);
                    AbstractC6118n.m27186d(string16, "getString(...)");
                    return string16;
                }
                break;
            case 646869308:
                if (id.equals("formal_rewrite")) {
                    String string17 = context.getString(R.string.formal_rewrite);
                    AbstractC6118n.m27186d(string17, "getString(...)");
                    return string17;
                }
                break;
            case 759783284:
                if (id.equals("professional_rewrite")) {
                    String string18 = context.getString(R.string.professional_rewrite);
                    AbstractC6118n.m27186d(string18, "getString(...)");
                    return string18;
                }
                break;
            case 815540476:
                if (id.equals("creative_rewrite")) {
                    String string19 = context.getString(R.string.creative_rewrite);
                    AbstractC6118n.m27186d(string19, "getString(...)");
                    return string19;
                }
                break;
            case 962336163:
                if (id.equals("shrink_text")) {
                    String string20 = context.getString(R.string.shrink_text);
                    AbstractC6118n.m27186d(string20, "getString(...)");
                    return string20;
                }
                break;
            case 989368054:
                if (id.equals("grammar_correction")) {
                    String string21 = context.getString(R.string.grammar_correction);
                    AbstractC6118n.m27186d(string21, "getString(...)");
                    return string21;
                }
                break;
            case 1465715788:
                if (id.equals("correct_all")) {
                    String string22 = context.getString(R.string.correct);
                    AbstractC6118n.m27186d(string22, "getString(...)");
                    return string22;
                }
                break;
        }
        return prompt.getTitle();
    }

    /* JADX INFO: renamed from: u */
    public final List m16395u(Context context) {
        AbstractC6118n.m27187e(context, "context");
        String string = context.getSharedPreferences("ai_prompts", 0).getString("saved_prompts", null);
        if (string == null) {
            return AbstractC1638q.m6765j();
        }
        try {
            Object objM22622j = new C5026e().m22622j(string, new b().m22815d());
            AbstractC6118n.m27184b(objM22622j);
            return (List) objM22622j;
        } catch (Exception unused) {
            return AbstractC1638q.m6765j();
        }
    }

    /* JADX INFO: renamed from: v */
    public final AiPrompt m16396v() {
        return new AiPrompt("short_summary", "Short Summary", "", false, 0L, 16, null);
    }

    /* JADX INFO: renamed from: w */
    public final AiPrompt m16397w() {
        return new AiPrompt("shrink_text", "Shrink Text", "", false, 0L, 16, null);
    }

    /* JADX INFO: renamed from: x */
    public final AiPrompt m16398x() {
        return new AiPrompt("simple_rewrite", "Simple Style", "", false, 0L, 16, null);
    }

    /* JADX INFO: renamed from: y */
    public final AiPrompt m16399y() {
        return new AiPrompt("social_rewrite", "Social Style", "", false, 0L, 16, null);
    }

    /* JADX INFO: renamed from: z */
    public final AiPrompt m16400z(String targetLanguage) {
        AbstractC6118n.m27187e(targetLanguage, "targetLanguage");
        return new AiPrompt("translation", "Translate to " + targetLanguage, "", false, 0L, 16, null);
    }
}
